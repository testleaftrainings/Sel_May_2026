package org.testleaf.week5.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSimpleAlert {

    public static void main(String[] args) {
         //Launch the browser
        ChromeDriver driver=new ChromeDriver();

        //load the url - get
        driver.get("https://leafground.com/alert.xhtml");

        //maximize the browser
        driver.manage().window().maximize();

        //CLick the Show button for simple Alert
        driver.findElement(By.xpath("//span[text()='Show']")).click();

        //Click the promt alert
       // driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following-sibling::button"));

        //Switch to the Alert box
        Alert simpleAlert = driver.switchTo().alert();

        //accept the alert
        simpleAlert.accept();

        

}
}