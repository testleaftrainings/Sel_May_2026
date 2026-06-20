package org.testleaf.week5.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class LearnPromptAlert {

    public static void main(String[] args) {
         //Launch the browser
        ChromeDriver driver=new ChromeDriver();

        //load the url - get
        driver.get("https://leafground.com/alert.xhtml");

        //maximize the browser
        driver.manage().window().maximize();

        //Click the show button for Prompt Alert
        driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following-sibling::button")).click();
    
        //Switch the focus
        Alert promptAlert = driver.switchTo().alert();

        //SendKeys
        promptAlert.sendKeys("Vineeth");

        //get the text from the alert
        String textOnAlert=promptAlert.getText();
       System.out.println("textOnAlert is: "+textOnAlert);

       //accept the alert
        promptAlert.accept();

    }

}
