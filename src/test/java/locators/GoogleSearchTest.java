package locators;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseTest {

    @Test
    public void googleSearch(){

        webDriver.get("https://www.google.com/");

        WebElement searchInput = webDriver.findElement(By.xpath("//*[@name='q']"));
        searchInput.sendKeys("Testfort");
        searchInput.submit();

        WebElement firstLink = webDriver.findElement(By.xpath("//a[@href='https://testfort.com/']"));
        firstLink.click();

    }

}
