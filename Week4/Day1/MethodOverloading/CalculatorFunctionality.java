package org.testleaf.week4.day1;

public class CalculatorFunctionality {

    //addNumbers with 2 Arguments
    public void addNumbers(int a, int b){
    System.out.println(a+b);
    }

    //addNumbers with 3 arguments
    public void addNumbers(int a, int b,int c){
    System.out.println(a+b+c);
    }

    //addTwoDecimalNumbers
    public void addNumbers(float a, float b){
    System.out.println(a+b);
    }

    public static void main(String args[]){
        CalculatorFunctionality calcOptions=new CalculatorFunctionality();
        calcOptions.addNumbers(5,3,1);
        calcOptions.addNumbers(5,2);
        calcOptions.addNumbers(1.5f, 5.4f);

    }

}
