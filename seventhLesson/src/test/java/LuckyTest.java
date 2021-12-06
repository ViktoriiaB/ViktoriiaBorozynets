import org.testng.Assert;
import org.testng.annotations.*;
import seventhLesson.*;

public class LuckyTest {

    Lucky lucky = new Lucky();


    @BeforeTest
    public void beforeTest (){
        System.out.println("This is text before each test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("This is text after each test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("This is text before all tests");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("This is text before all tests");
    }

    @DataProvider
    public Object[][] luckyDataProvider(){
        int[] myArray = {15, 43, 16, 41, 9, 5};
        int[] myArray1 = {56, 10, 24, 23, 1, 92};
        int[] myArray2 = {11, 8, 65, 74, 3, 15};

        return new Object[][]{
             {myArray, 5, false},
             {myArray1, 1, true},
             {myArray2, 4, false},
        };
   }

    @Test (dataProvider = "luckyDataProvider")
    public void checkIntegerTest (int []myArray, int index, boolean result) throws CustomLengthException, WrongTypeException, NegativeValueException, LengthTypeException {
    Assert.assertEquals(lucky.checkInteger(myArray, index), result);
}

}
