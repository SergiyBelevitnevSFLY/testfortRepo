package locators;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WikiTest extends BaseTest {

    @Test
    public void wikiTest() throws InterruptedException {
        webDriver.get("https://en.wikipedia.org/wiki/Document_Object_Model");

        WebElement  xmlLink = webDriver.findElement(By.xpath("(//div[@class='mw-parser-output']//a[@href='/wiki/XML'])[1]"));
        xmlLink.click();


        WebElement searchInput = webDriver.findElement(By.cssSelector("input#searchInput"));
        searchInput.sendKeys("selenium");
        searchInput.submit();

        System.out.println("");

    }
}
