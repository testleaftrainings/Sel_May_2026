package org.testleaf.week1.day2;

public class LearnJavaOperators {

    public static void main(String[] args) {

        //Assignment Operators
        //Arithmetic/Mathematical Operator
        //Comparison Operator
        //Logical Operator
        //Increment/Decrement

        //Assignment Operators -assign a value to a variable
        int number = 10;

        //Arithmetic/Mathematical Operator
        // add, sub, mul, div

        int a=7;
        int b=3;
        
        //add 
        System.out.println(a+b);  //11

        //sub 
       System.out.println(a-b);  //5

       //mul 
       System.out.println(a*b);        //24

       //div
      //quotient   /
       System.out.println(a/b);   
      //remainder  %
       System.out.println(a%b);  

       System.out.println("-----------------------");

       //Comparison Operator - compare two values
       int c=10;
       int d=15;
       
       //lessThan   
       System.out.println(c<d);  //10<15
      
       //greaterThan   
       System.out.println(c>d);  //10>15

       //equalTo 
       System.out.println(c==d);  //10==15
       
       //lessThanOrEqualTo 
       System.out.println(c<=d);   //10<15   or 10==15
       
       //greaterThanOrEqaulTo
       System.out.println(c>=d);  //10>15   or 10==15
       
       //notEqual 
       System.out.println(c!=d);   //10 is not equal 15

       System.out.println("-----------------------");

       //Logical
     //Compare 2 conditions
       int x=10;
       int y=10;

       //AND   condition1   and  condition2
       System.out.println(x>y&&x==y);
       
    //OR condition1   or  condition2
    System.out.println(x>y||x==y);

    //Increment/Decrement

    //Increment      
    //postIncrement
    int value=7;
    System.out.println(value++);  // 7
    //System.out.println(value);   //8
    
    //preIncrement
    System.out.println(++value); //  9

    //postDecrement
     System.out.println(value--);  //9
     System.out.println(value);
     
     //preDecrement
     System.out.println(--value);  //7


     //what is the value of  m++ - m-- + --m - ++m
     int  m=10;
     m++;  //10
     m--;  //11
     --m;  //9
     ++m;  //10
     System.out.println(m);
    }
}
