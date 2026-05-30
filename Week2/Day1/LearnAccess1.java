package org.testleaf.week2.day1;

public class LearnAccess1 {

    public void method1(){
    System.out.println("method1");
    }

    private void privateMethod(){
    System.out.println("privateMethod");
    }

    public static void main(String[] args) {
        LearnAccess1 obj=new LearnAccess1();
        obj.method1();
        obj.privateMethod();
        
    }

}
