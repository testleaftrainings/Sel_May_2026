package org.testleaf.week5.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {

    public static void main(String[] args) throws IOException {
        //Launch the browser
        ChromeDriver driver=new ChromeDriver();

        //load the url - get
        driver.get("https://leaftaps.com/opentaps/control/main");

        //maximize the browser
        driver.manage().window().maximize();

        //WebElement ele=driver.findElement(By.id("username"));

        //Step1: take the screenshot
        File sourceFile = driver.getScreenshotAs(OutputType.FILE);

        //Step2: assign the path
        File destFile=new File("learn_automation/snaps/leaftaps.png");

        //Step3:
        FileUtils.copyFile(sourceFile, destFile);
    }

}
