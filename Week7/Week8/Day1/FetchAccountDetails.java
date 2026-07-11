package org.testleaf.week8.day1;

public class FetchAccountDetails {

    public static void main(String[] args) {
        AccountDetails acc=new AccountDetails();
       //System.out.println(acc.number);
       acc.setter(21);

       int getNumber = acc.getter();
       System.out.println(getNumber);
    }

}
