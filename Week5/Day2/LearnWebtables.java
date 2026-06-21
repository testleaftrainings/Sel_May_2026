package org.testleaf.week5.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtables {
public static void main(String[] args) {
    //Launch the browser
        ChromeDriver driver=new ChromeDriver();

        //load the url - get
        driver.get("https://leafground.com/table.xhtml");

        //maximize the browser
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //To find the number of rows
        //To find the number of columns
        //To print the particular data
        //To print entire row/entire column
        //To print all data

        //To find the number of rows
        List<WebElement> rowEle = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
        //[we1, we2,,,,,,,,,,,,,,,   we3]
        int rowCount = rowEle.size();
        System.out.println("rowCount is: "+rowCount);

        //To find the number of columns
        List<WebElement> colEle = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td"));
        //  0   1    2     3    4   5
        //[we1, we2, we3, we4, we5, we6]
        int colCount=colEle.size();
        System.out.println("colCount is: "+colCount);

        //To print entire row/entire column
        for(int i=0;i<colCount;i++){
        String text=colEle.get(i).getText();
        //String text=colEle.get(1).getText();
        System.out.println("text is: "+text);
        }

        //
    }
}
