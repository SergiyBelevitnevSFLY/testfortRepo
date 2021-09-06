import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTest {


    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @Test
    public void firstTest() {
        System.out.println("First Test");
        int price = 14;
        Assert.assertEquals(price, 14);
    }

    @Test
    public void secondTest() {
        System.out.println("Second Test");
        double price = 14.65;
        Assert.assertTrue(price > 63);
    }
}
