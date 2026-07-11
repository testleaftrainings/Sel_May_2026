package org.testleaf.week8.day1;

public class AccountDetails {

    //Encapsulation 
    //Bind our methods and Variables inside a Same Class
    //Private Variable and Public method

    private int number;

    //getter and setter
//                            21
    public void setter(int number){
    this.number=number;
    }

     public int  getter(){
        return number;
    }


public static void main(String[] args) {
    AccountDetails acc=new AccountDetails();
    System.out.println(acc.number);
   }


}
