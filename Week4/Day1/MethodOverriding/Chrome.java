package org.testleaf.week4.day1;

public class Chrome extends Browser {

    public void launch(){
        //super.launch();
         System.out.println("Launch Chrome Browser");
    }

    public static void main(String args[]){
    Chrome chromeOpt=new Chrome();
    chromeOpt.launch();
    }

}
