package org.testleaf.week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnImplicitWait {

    public static void main(String[] args) {
          //Handle the browser in guest mode
      ChromeOptions opt=new ChromeOptions();
      opt.addArguments("guest");

       //Launch the browser
        ChromeDriver driver=new ChromeDriver(opt);

        //load the url - get
        driver.get("https://leaftaps.com/opentaps/control/main");

        //maximize the browser
        driver.manage().window().maximize();

        //add implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Enter the username
        WebElement usernameTextField= driver.findElement(By.xpath("//input[@id='username']"));
         usernameTextField.sendKeys("DemoCSR");
         
        //Enter Password
         driver.findElement(By.id("password")).sendKeys("crmsfa");

         //Find the label
       WebElement ele=driver.findElement(By.xpath("//label[text()='Username']"));
       System.out.println(ele);

       //To get the text from the element
       String text = ele.getText();
       System.out.println("text is: "+text);


    }

}
