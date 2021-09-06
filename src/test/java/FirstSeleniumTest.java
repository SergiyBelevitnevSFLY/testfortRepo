import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstSeleniumTest {


    @Test
    public void firstSeleniumTest(){

        String pathToProject = System.getProperty("user.dir");
        String pathToDriver = pathToProject + "/chromedriver";
        System.setProperty("webdriver.chrome.driver", pathToDriver);

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.google.com/");

        WebElement searchInput = webDriver.findElement(By.xpath("//*[@name='q']"));
        searchInput.sendKeys("Testfort");
        searchInput.submit();

        WebElement firstLink = webDriver.findElement(By.xpath("//a[@href='https://testfort.com/']"));
        firstLink.click();

    }


    @Test
    public void secondSeleniumTest(){

        WebDriverManager.firefoxdriver().setup();

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://www.google.com/");

        WebElement searchInput = webDriver.findElement(By.xpath("//*[@name='q']"));
        searchInput.sendKeys("Testfort");
        searchInput.submit();

        WebElement firstLink = webDriver.findElement(By.xpath("//a[@href='https://testfort.com/']"));
        firstLink.click();

    }

}
