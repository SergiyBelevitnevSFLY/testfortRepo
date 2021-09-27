package locators.Lesson18;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ActionsExample extends BaseTest {

    @Test
    public void mouseHover() throws InterruptedException {
        webDriver.get("http://the-internet.herokuapp.com/hovers");
        Actions actions = new Actions(webDriver);
        Thread.sleep(3000);
        WebElement elementToHover = webDriver.findElement(By.xpath("//div[@class='figure'][2]"));
        actions.moveToElement(elementToHover).build().perform();
        webDriver.findElement(By.cssSelector("a[href='/users/2']")).click();
    }

    @Test
    public void dragAndDrop() {
        webDriver.get("http://way2automation.com/way2auto_jquery/droppable.php#load_box");
        webDriver.switchTo().frame(webDriver.findElement(By.xpath("//*[@class='demo-frame']")));
        Actions actions = new Actions(webDriver);
        WebElement draggable = webDriver.findElement(By.id("draggable"));
        WebElement droppable = webDriver.findElement(By.id("droppable"));
        actions.dragAndDrop(draggable, droppable).release().build().perform();
    }

    @Test
    public void homeWorkExample() throws InterruptedException {
        webDriver.get("https://demoqa.com/automation-practice-form");
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;
        Thread.sleep(1000);
        javascriptExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        webDriver.findElement(By.xpath("//*[@class =' css-yk16xz-control']")).click();
        webDriver.findElement(By.xpath("//div[contains(text(),'NCR')]")).click();

//        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getDriver();
//        javascriptExecutor.executeScript("arguments[0].click();", getDriver().findElement(By.id("react-select-3-option-2")));
        System.out.println("");
    }
}
