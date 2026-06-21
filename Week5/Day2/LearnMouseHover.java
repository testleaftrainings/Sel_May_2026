package org.testleaf.week5.day2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LearnMouseHover {

    public static void main(String[] args) {
        //Step1: findElement
        //Step2: Create Object
        //Step3: use the method
        //Launch the browser
        ChromeDriver driver=new ChromeDriver();

        //load the url - get
        driver.get("https://www.pvrcinemas.com/");

        //maximize the browser
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Step1: findElement
        WebElement ele=driver.findElement(By.xpath("//span[text()='More']"));

        //Step2:
        Actions act=new Actions(driver);

        //Step3: moveToElement
        act.moveToElement(ele).perform();
  }

}
