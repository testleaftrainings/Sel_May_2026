package org.testleaf.week8.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWebDriverWait {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver=new ChromeDriver();

        driver.get("https://leafground.com/waits.xhtml");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//span[text()='Click']")).click();
        //Thread.sleep(10000);
        
        //Declare WebDriverWait
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        
        WebElement wb = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
       

        //pooling time - 500ms

        //fluent    - 2s


        boolean displayed=wb.isDisplayed();

        //boolean displayed = driver.findElement(By.xpath("//span[text()='I am here']")).isDisplayed();

        System.out.println("The element is: "+displayed);
}
}