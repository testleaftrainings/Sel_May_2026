package org.testleaf.week2.day1;

public class AddFunction {
  
    public int  add(int a, int b){
    return a+b;
    //return "Learn return types";
    }

    public static void main(String[] args) {
        AddFunction addfunc=new AddFunction();
        addfunc.add(10, 20);

        int addNumbers=addfunc.add(10, 20);
        System.out.println(addNumbers);
    }
}
