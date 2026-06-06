package org.testleaf.week3.day1;

import java.util.Arrays;

public class PrintDuplicates {

    public static void main(String[] args) {
        //Declare an array
        int num[]={2,5,7,7,9,2,5,3};

        //To sort the array - arranging in ascending order - lowest to highest
        Arrays.sort(num);
        //   0 1 2 3 4 5 6 7
        //  {2,2,3,5,5,7,7,9}

        for(int i=0;i<num.length-1;i++){
            if(num[i]==num[i+1]){
           System.out.println(num[i]);
            }
        }    
    }
}
