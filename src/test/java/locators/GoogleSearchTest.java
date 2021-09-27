package locators;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GoogleSearchTest extends BaseTest {

    @Test
    public void googleSearch(){

        webDriver.get("https://www.google.com/");

        By googleSearchInput = By.xpath("//*[@name='q']");

        WebElement searchInput = webDriver.findElement(googleSearchInput);
        List<WebElement> webElementList = webDriver.findElements(By.xpath("//div[@class='left']/a"));

        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 5);
        webDriverWait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//div[@class='left']/a"),5));

        searchInput.sendKeys("Testfort");
        searchInput.submit();

        String searchInputAttribute = searchInput.getAttribute("class");
        String searchInputText = searchInput.getText();


        int x = searchInput.getLocation().getX();
        Assert.assertEquals(searchInputAttribute,"feed");

        webDriver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

        WebElement firstLink = webDriver.findElement(By.xpath("//a[@href='https://testfort.com/']"));
        firstLink.click();

    }

}
