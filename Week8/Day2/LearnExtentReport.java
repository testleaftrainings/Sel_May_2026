package org.testleaf.week8.day2;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

  
    //

    //

    public static void main(String[] args) {
        //Step1:Setup the path
    ExtentHtmlReporter reporter=new ExtentHtmlReporter("learn_automation/reports/leaftapsreport.html");

    //Step2: Create the report
    ExtentReports extent=new ExtentReports();

    //step3: attach the data
    extent.attachReporter(reporter);

    //Step4:
    ExtentTest createLead=extent.createTest("CreateLead");

    //Step5:
      createLead.assignCategory("Regression");
      createLead.assignAuthor("Vineeth");

      //Step6:flush
      extent.flush();

      System.out.println("Code completed");
    }

}
