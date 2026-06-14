package org.testleaf.week4.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
public static void main(String args[]){

    //Declare a Set
    //HashSet
    //Set<String> mentorsName=new HashSet<String>();

    //TreeSet
    //Set<String> mentorsName=new TreeSet<String>();

    //LinkedHashSet
    Set<String> mentorsName=new LinkedHashSet<String>();

    System.out.println("The set is: "+mentorsName);

    //adding an element
    mentorsName.add("Bala");
    mentorsName.add("Arun");
    mentorsName.add("Harrish");
    mentorsName.add("Selvi");
    mentorsName.add("Venkatesh");


   System.out.println("The set is: "+mentorsName);

    mentorsName.add("venkatesh");
   System.out.println("The set after adding duplicate is: "+mentorsName);


   //real time usecase
   //How to get element in Set

   //move all the values from Set to List and then i have use the get method

   //Declare a List
   List<String> trainers=new ArrayList<String>(mentorsName);
   System.out.println("The List is: "+trainers);
      }
}
