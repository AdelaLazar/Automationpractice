package Tests;

import Base.ShareData;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FrameTest extends ShareData {


    @Test
    public void FrameTest(){

        WebElement skipSignInElement= driver.findElement(By.id("btn2"));
        skipSignInElement.click();

        WebElement switchtoelement= driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions Action = new Actions(driver);
        Action.moveToElement(switchtoelement).perform();

        WebElement frameElement = driver.findElement(By.xpath("//a[text()='Alerts']"));
        frameElement.click();

        driver.navigate().to("http://demo.automationtesting.in/Frames.html");

        driver.switchTo().frame("singleframe");
        WebElement inputText = driver.findElement(By.cssSelector("div>input[type='text']"));
        inputText.sendKeys("Foame");

        WebElement multipleIframe = driver.findElement(By.cssSelector("a[href='multiple']"));
        multipleIframe.click();

        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='MultipleFrame.html'")));
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']")));
        WebElement inputText2= driver.findElement(By.cssSelector("div>input[type='text']"));
        inputText2.sendKeys("Imi e tare foame acum");


        driver.switchTo().defaultContent();



    }
}
