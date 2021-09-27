package locators;

import base.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdvancedSelenium extends BaseTest {

    String webTableLocator = "//table[@id='table1']/tbody[1]/tr/td[%s]";

    By locator = By.xpath(String.format(webTableLocator, 4));

    @Test
    public void advancedSelenium(){

        webDriver.get("http://the-internet.herokuapp.com/dropdown");
        Select select = new Select(webDriver.findElement(By.id("dropdown")));

        select.selectByIndex(1);

//        String selectedOption = ;

        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Option 2");

        System.out.println("");


        Alert alert = webDriver.switchTo().alert();

        alert.getText();

        webDriver.switchTo().defaultContent();





    }


    @Test
    public void alert(){

        webDriver.get("http://the-internet.herokuapp.com/javascript_alerts");
        webDriver.findElement(By.xpath("(//button)[2]")).click();

        //(//button)[2]

        Alert alert = webDriver.switchTo().alert();

        alert.accept();

        webDriver.switchTo().defaultContent();

        System.out.println("");

    }


    @Test
    public void iFrame(){

        webDriver.get("http://the-internet.herokuapp.com/iframe");

        webDriver.switchTo().frame(webDriver.findElement(By.xpath("//*[@id='mce_0_ifr']")));

        webDriver.findElement(By.xpath("//*[@id='tinymce']")).sendKeys("Something");

        webDriver.switchTo().defaultContent();

        webDriver.findElement(By.xpath("//*[text()='File']")).click();

        System.out.println("");

    }

    @Test
    public void actions(){
        Actions actions = new Actions(webDriver);
        WebElement webElement1 = null;
        WebElement webElement2 = null;
        actions.dragAndDrop(webElement1, webElement2).release().build().perform();


        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement okButton = webDriver.findElement(By.xpath(""));
        js.executeScript("arguments[0].click();", okButton);

        js.executeScript("window.scrollBy(0,500)");
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        js.executeScript("arguments[0].scrollIntoView();", okButton);

    }
}
