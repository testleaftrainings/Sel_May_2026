package org.testleaf.week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {
public static void main(String[] args) {
     //Launch the browser
        ChromeDriver driver=new ChromeDriver();

        //load the url - get
        driver.get("https://leafground.com/frame.xhtml");

        //maximize the browser
        driver.manage().window().maximize();

        //switch to outer frame
        driver.switchTo().frame(2);

        //switch to inner frame
        //driver.switchTo().frame(0);
         driver.switchTo().frame("frame2");

         //Click the button
        driver.findElement(By.id("Click")).click();

        //Switch to the main webpage
        driver.switchTo().defaultContent();

        //Switch to the immediate parent frame
        driver.switchTo().parentFrame();

}
}
