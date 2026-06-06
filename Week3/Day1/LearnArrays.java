package org.testleaf.week3.day1;

import java.util.Arrays;

public class LearnArrays {

    public static void main(String[] args) {
        
      //Declare an array - Literal
     //   index       0  1  2  3  4      
      int scores[]= {78,100,46,65,96};

       //To find the number of elements in the Array - length
        int lengthOfArray=scores.length;
        System.out.println("lengthOfArray is "+lengthOfArray);
      
        //To retrieve a single value
      System.out.println(scores[2]);

      //Print all the values in the Array
      //0    1    2     3     4      5
    for (int i = 0; i < lengthOfArray; i++) {
          System.out.println(scores[i]);
          //System.out.println(scores[0]);   //78
          //System.out.println(scores[1]);   //100
          //System.out.println(scores[2]);   //46
          //System.out.println(scores[3]);   //65
          //System.out.println(scores[4]);   //96
          //System.out.println(scores[5]);

      }

  //Sort the Array - arranging in ascending order - lowest to highest
Arrays.sort(scores);
 
//Lowest
System.out.println("The lowset is: "+scores[0]);

//Highest
System.out.println(scores[lengthOfArray-1]);

//Instantiation

int[] marks=new int[5];
marks[0] = 100;
marks[1] = 90;
marks[2] = 85;
marks[3] = 95;
marks[4] = 80;

    }

}

