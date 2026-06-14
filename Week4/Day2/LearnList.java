package org.testleaf.week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

    public static void main(String args[]){

     //Declare a List
     List<String> learnersName =new ArrayList<String>();

     //empty list []
     System.out.println("The List is: "+learnersName);

     //add an element - add()      [Bharath]
     learnersName.add("Bharath");
     System.out.println("The List is: "+learnersName);

     //add more elements     [Bharath,Maha]
     learnersName.add("Maha");
     System.out.println("The List is: "+learnersName);

     learnersName.add("Ashwin");
     learnersName.add("Wasim");

     //The List after adding 4 elements
     //    0      1      2       3  
     //[Bharath, Maha, Ashwin, Wasim]
     System.out.println("The List is: "+learnersName);

     //add duplicates and check
     learnersName.add("Ashwin");
     System.out.println("The List after adding duplicates is: "+learnersName);
    //    0      1       2    3       4
    //[Bharath, Maha, Ashwin, Wasim, Ashwin]

    //remove an element   - remove
    learnersName.remove("Ashwin");
     System.out.println("The List after removing is: "+learnersName);
    //    0        1     2      3
     //[Bharath, Maha, Wasim, Ashwin]

     //To retrieve an element - index   -get()
     String eleAtIndex1 = learnersName.get(3);
     System.out.println("eleAtIndex1 is: "+eleAtIndex1);

     //addAll
     //To add all the elements from 1 List to another List
     List<String> employeesName=new ArrayList<String>();
     System.out.println("the employee List: "+employeesName);

     employeesName.addAll(learnersName);
     System.out.println("the employee List: "+employeesName);

     //Size - to count the number of elemnts
     int sizeOfList=employeesName.size();
     System.out.println("sizeOfList: "+sizeOfList);

     Collections.sort(employeesName);

     //clear - clear all the elements in the List and left the empty List
     employeesName.clear();
     System.out.println("employeesName: "+employeesName);
    }

}
