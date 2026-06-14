package org.testleaf.week4.day2;

import java.util.Set;
import java.util.ArrayList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

    public static void main(String args[]){
        //Launch the browser
        ChromeDriver driver=new ChromeDriver();

        //load the url - get
        driver.get("https://leafground.com/window.xhtml");

        //maximize the browser
        driver.manage().window().maximize();

        //Click the button
        driver.findElement(By.xpath("//span[text()='Open']")).click();

        //getWindowHandle
        String parentAddress=driver.getWindowHandle();
        System.out.println("The Parent address is: "+parentAddress);

       //getWindowHandles
        Set<String> allAddress=driver.getWindowHandles();
        System.out.println("address is: "+allAddress);

        //Declare a List
        List<String> address=new ArrayList<String>(allAddress);

        String parentTitle=driver.getTitle();
         System.out.println("titile is: "+parentTitle);

       //switch the focus from parent to child
       driver.switchTo().window(address.get(1));

       String childTitle=driver.getTitle();
         System.out.println("titile is: "+childTitle);

         //close the driver
         driver.close();

         driver.switchTo().window(address.get(0));

         String title=driver.getTitle();
    }

}
