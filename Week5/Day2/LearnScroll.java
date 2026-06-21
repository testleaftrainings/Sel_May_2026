package org.testleaf.week5.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class LearnScroll {
public static void main(String args[]){
    //Launch the browser
        ChromeDriver driver=new ChromeDriver();

        //load the url - get
        driver.get("https://www.amazon.in/");

        //maximize the browser
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //find the element
        WebElement ele=driver.findElement(By.linkText("Conditions of Use & Sale"));

        Actions act=new Actions(driver);

        act.scrollToElement(ele).perform();
    }
}
