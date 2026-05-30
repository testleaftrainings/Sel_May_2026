package org.testleaf.week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

    public static void main(String[] args) {
        //Launch the browser
        ChromeDriver driver=new ChromeDriver();

        //Launch Edge driver
        //EdgeDriver driver=new EdgeDriver();

        //load the url - get()
        driver.get("https://www.facebook.com/");

        //maximize the browser
        driver.manage().window().maximize();

        //close the browser
        driver.close();
        
    }

}
