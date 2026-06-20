package org.testleaf.week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSweetAlert {

    public static void main(String args[]){
 //Launch the browser
        ChromeDriver driver=new ChromeDriver();

        //load the url - get
        driver.get("https://leafground.com/alert.xhtml");

        //maximize the browser
        driver.manage().window().maximize();

        //Click the Sweet Alert button
        driver.findElement(By.xpath("//h5[text()='Sweet Alert (Simple Dialog)']/following-sibling::button")).click();
    
        //Handle the Sweet Alert
        driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
    
    }

}
