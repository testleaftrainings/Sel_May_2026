package org.testleaf.week5.day1;

public class LearnFinalKeyword {

    //final
    //variable - connot be modified
    //method   - it can be overrided
    //Class    - it cannot be inherited

    public static void main(String[] args) {
        final int password=7;

        password=password+3;

        System.out.println(password);


    }

}
