package org.testleaf.week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

    public static void main(String[] args) {
        //Launch the browser
        ChromeDriver driver=new ChromeDriver();

        //load the url - get
        driver.get("https://leafground.com/frame.xhtml");

        //maximize the browser
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //switch to the frame
        //By index
        //driver.switchTo().frame(0);
        
        //By WebElement
        WebElement element = driver.findElement(By.xpath("//h5[text()=' Click Me (Inside frame)']/following-sibling::iframe"));
        driver.switchTo().frame(element);
        
        //Clcik the Click button
        driver.findElement(By.id("Click")).click();
    }

}
