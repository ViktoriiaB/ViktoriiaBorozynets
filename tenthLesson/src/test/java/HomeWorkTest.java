import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWorkTest {

    WebDriver driver;
    private static final String URL = "https://demoqa.com/automation-practice-form";
    private static final String URL2 = "https://demoqa.com/checkbox";

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() {
        driver.get(URL);
        WebElement ads = driver.findElement(By.id("fixedban"));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].parentNode.removeChild(arguments[0])", ads);

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Viktoriia");
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Borozynets");
        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys("v.borozynets@gmail.com");

        driver.findElement(By.xpath("//*[contains(@class, 'custom-control custom-radio custom-control-inline')]//*[@id = 'gender-radio-2']")).click();

        WebElement userNumber = driver.findElement(By.id("userNumber"));
        userNumber.sendKeys("0934894057");

        WebElement dateOfBirthInput = driver.findElement(By.id("dateOfBirthInput"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].value='20.08.1995';", dateOfBirthInput);

        driver.findElement(By.xpath("//*[contains(@class, 'custom-control custom-checkbox custom-control-inline')]//*[@id = 'hobbies-checkbox-3']"));

       WebElement currentAddress = driver.findElement(By.id("currentAddress"));
       currentAddress.sendKeys("Lviv");

        WebDriverWait state = new WebDriverWait(driver, 20);
        state.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("react-select-3-input")))).sendKeys("NCR", Keys.ENTER);

        WebDriverWait city = new WebDriverWait(driver, 20);
        city.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("react-select-4-input")))).sendKeys("Delhi", Keys.ENTER);

        driver.findElement(By.id("submit")).click();

        WebElement popup = driver.findElement(By.xpath("//*[@class = 'modal-content']"));

        Assert.assertEquals(popup.isDisplayed(), true);
    }

    @Test
    public void secondTest(){
        driver.get(URL2);
        WebElement ads = driver.findElement(By.id("adplus-anchor"));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].parentNode.removeChild(arguments[0])", ads);

        WebElement expandHome = driver.findElement(By.xpath("//*[contains(@class, 'rct-text')]//*[contains(@aria-label, 'Toggle')]/*[1]"));
        expandHome.click();

//        WebElement expandDownloads = driver.findElement(By.xpath()...
//        expandDownloads.click();

//        WebElement checkboxWordFile = driver.findElement(By.xpath()...
//        WebElement checkboxExcelFile = driver.findElement(By.xpath()...

//        Assert.assertEquals(checkboxWordFile.isSelected()),false);
//        Assert.assertEquals(checkboxExcelFile.isSelected()),false);

//        checkboxWordFile.click();
//        checkboxExcelFile.click();

//        Assert.assertEquals((checkboxWordFile.isSelected()),true);
//        Assert.assertEquals((checkboxExcelFile.isSelected()),true);

    }

}
