package org.testleaf.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadFunctionality {

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

        //Enter the username
        //finding the element - findElement
        //passing value in a text field - sendKeys
        //driver.findElement(By.id("username")).sendKeys("DemoCSR");
         
         WebElement usernameTextField = driver.findElement(By.id("username"));
         usernameTextField.sendKeys("DemoCSR");
         
        //Enter Password
         driver.findElement(By.id("password")).sendKeys("crmsfa");

         //Click Login Button
         driver.findElement(By.className("decorativeSubmit")).click();

         //Click crmsfa
         //driver.findElement(By.linkText("CRM/SFA")).click();
           driver.findElement(By.partialLinkText("CRM")).click();

         //Click on the Leads
         driver.findElement(By.linkText("Leads")).click();

         //Click on the Create Lead link
         driver.findElement(By.linkText("Create Lead")).click();

         //Enter the companyname
         driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

         //Enter the Firstname
         driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");

         //Enter the Lastname
         driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");


        //Handle the dropdown
        //Step1: find the element
        WebElement dropDown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));

//      Step2: Create OBject for Select Class
        Select options=new Select(dropDown1);

    //Step3: use the method
    //options.selectByIndex(2);

    //options.selectByValue("LEAD_EMPLOYEE");

    options.selectByVisibleText("Existing Customer");


         //Click Submit button
         driver.findElement(By.name("submitButton")).click();

         String titleOfPage = driver.getTitle();
         System.out.println("titleOfPage is "+titleOfPage);

         
    }

}
