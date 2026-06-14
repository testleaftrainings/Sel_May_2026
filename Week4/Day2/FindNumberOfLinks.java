package org.testleaf.week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNumberOfLinks {

    public static void main(String args[]){
        //Launch the browser
        ChromeDriver driver=new ChromeDriver();

        //load the url - get
        driver.get("https://www.facebook.com/");

        //maximize the browser
        driver.manage().window().maximize();

        //findElement and findElements
       List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//         0    1    2   3                       32
       //[we1, we2, we3, we4,  ,,,,,,,,,,,,,,,, we33]

       //To the number of elements
       int numberOfLinks=allLinks.size();
       System.out.println("numberOfLinks is: "+numberOfLinks);

       //Print the links
       // 0    1    2     3         32
       for(int i=0;i<numberOfLinks;i++){
        String allLinksText=allLinks.get(i).getText();
        System.out.println("The Links are: "+allLinksText);
          }
    }

}
