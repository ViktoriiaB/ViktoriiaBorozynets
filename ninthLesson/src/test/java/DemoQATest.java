import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoQATest {

    WebDriver driver;
    private static final String URL = "https://demoqa.com/";
    private static final String URL2 = "https://www.toolsqa.com/selenium-training/";
    private WebElement buttonJoin;


    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() {
        driver.get(URL);
        driver.findElement(By.xpath("//img[@src='/images/WB.svg']")).click();

        Assert.assertEquals(driver.getCurrentUrl(), URL2);

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs.size());
    }

    @Test
    public void secondTest() throws InterruptedException {
        driver.get(URL);
        Thread.sleep(3000);

        WebElement cardElements = driver.findElement(By.xpath("//*[contains(@class, 'top-card')]//*[contains(text(), 'Elements')]"));
        WebElement cardForms = driver.findElement(By.xpath("//*[contains(@class, 'top-card')]//*[contains(text(), 'Forms')]"));
        WebElement cardAlerts = driver.findElement(By.xpath("//*[contains(@class, 'top-card')]//*[contains(text(), 'Alerts, Frame & Windows')]"));
        WebElement cardWidgets = driver.findElement(By.xpath("//*[contains(@class, 'top-card')]//*[contains(text(), 'Widgets')]"));
        WebElement cardInteractions = driver.findElement(By.xpath("//*[contains(@class, 'top-card')]//*[contains(text(), 'Interactions')]"));
        WebElement cardBookStore = driver.findElement(By.xpath("//*[contains(@class, 'top-card')]//*[contains(text(), 'Book Store Application')]"));

        Assert.assertEquals(cardElements.getText(), "Elements");
        String forms = cardForms.getText();
        Assert.assertEquals(forms, "Forms");
        String alerts = cardAlerts.getText();
        Assert.assertEquals(alerts, "Alerts, Frame & Windows");
        String widget = cardWidgets.getText();
        Assert.assertEquals(widget, "Widgets");
        String interactions = cardInteractions.getText();
        Assert.assertEquals(interactions, "Interactions");
        String bookStore = cardBookStore.getText();
        Assert.assertEquals(bookStore, "Book Store Application");
    }


    @Test
    public void thirdTest() throws InterruptedException {
        driver.get(URL);
        Thread.sleep(3000);
        WebElement cardElements = driver.findElement(By.xpath("//*[contains(@class, 'top-card')]//*[contains(text(), 'Elements')]"));
        cardElements.click();

        WebElement textBox = driver.findElement(By.xpath("//*[@class = 'element-group']//*[contains(@class, 'show')]//*[@id = 'item-0']"));
        textBox.click();

        WebElement inputFullName = driver.findElement(By.id("userName"));
        WebElement inputEmail = driver.findElement(By.id("userEmail"));
        WebElement inputCurrentAddress = driver.findElement(By.id("currentAddress"));
        WebElement inputPermanentAddress = driver.findElement(By.id("permanentAddress"));
        WebElement submitButton = driver.findElement(By.id("submit"));

        inputFullName.sendKeys("Viktoriia Borozynets");
        inputEmail.sendKeys("v.borozynets@gmail.com");
        inputCurrentAddress.sendKeys("Lviv");
        inputPermanentAddress.sendKeys("Lviv");

        submitButton.submit();

        WebElement rowName = driver.findElement(By.cssSelector("#name"));
        WebElement rowEmail = driver.findElement(By.cssSelector("#email"));
        WebElement rowCurrentAddress = driver.findElement(By.cssSelector("#currentAddress"));
        WebElement rowPermanentAddress = driver.findElement(By.cssSelector("#permanentAddress"));

        Assert.assertEquals(rowName.getText(),"Name:Viktoriia Borozynets");
        Assert.assertEquals(rowEmail.getText(),"Email:v.borozynets@gmail.com");
        Assert.assertEquals(rowCurrentAddress, "Current Address :Lviv");
        Assert.assertEquals(rowPermanentAddress.getText(), "Permananet Address :Lviv");

        Map<String, String> map = new HashMap<>();
        map.put("Name","Viktoriia Borozynets");
        map.put("Email", "v.borozynets@gmail.com");
        map.put("Current Address", "Lviv");
        map.put("Permananet Address", "Lviv");
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}




