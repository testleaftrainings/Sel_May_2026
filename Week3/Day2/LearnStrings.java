package org.testleaf.week3.day2;

public class LearnStrings {

    public static void main(String[] args) {
        //Declare the String
        //String Literal
        String str1="TestLeaf";   //0001
        String str3="TestLeaf";  //0001

        //Instantiation
        String str2=new String("TestLeaf"); //0002
        String str4=new String("TestLeaf"); //0003

        //difference between == and .equals
        // ==  compare the reference addresses of two Strings
        // .equals  compares the exaxt value of two Strings

        System.out.println(str1==str3);  //
        System.out.println(str1==str2);  //  
        System.out.println(str1.equals(str2));

        System.out.println("------------------------");

        //equals and contains
        //equals compares the exact value
        //contains compares the partial value
        System.out.println(str1.equals(str2));
        System.out.println(str1.contains("test"));

        //compare 2 String by ignoring the case
        //String str1="TestLeaf";
        System.out.println(str1.equalsIgnoreCase("testleaf"));

        //length - to count the number of Characaters in a String
       //                 0123456
        String batchName="Sel May";

        int lengthOfString = batchName.length();
        System.out.println("lengthOfString is "+lengthOfString);

        //To Retrieve/get a single Character in a String
        char charAtIndex2 = batchName.charAt(2);
        System.out.println("charAtIndex2 is: "+charAtIndex2);

        //To Retraive all the values
        for(int i=0;i<lengthOfString;i++){
            System.out.println(batchName.charAt(i));
            //System.out.println(batchName.charAt(0)); //S
            //System.out.println(batchName.charAt(1)); //e
            ////System.out.println(batchName.charAt(2));//l
        }

       //toUpperCase - convert the String into uppercase
       //toLowerCase - convert the String into lowercase

       String upperCase = batchName.toUpperCase();
       System.out.println("upperCase is:  "+upperCase);

      //split method - convert the String into multiple Strings
       String batch ="Sel May 2026";

     String[] splitedString = batch.split(" ");
     System.out.println(splitedString[1]);


     String name="Vineeth";
     //  0  1   2    3   4   5   6
     //{'V','i','n','e','e','t','h'}
     //toCharArray - Convert the String into Character Array

     char[] charArray = name.toCharArray();
     System.out.println(charArray[0]);

     //subString - crop the String and gives the cropped String
     //                  0123456
     String mentorsName="Harrish";
     String substring = mentorsName.substring(2);
     System.out.println("substring is: "+substring);

     String substring2 = mentorsName.substring(2, 5);
     System.out.println("substring2 is: "+substring2);

     //replace all
     String rate ="700$ Rupees";
     int rupees=100;
     System.out.println(rate+rupees);     // 700Rupees100

     String replaceAll = rate.replaceAll("[^0-9]", "");
     System.out.println("replaceAll is: "+replaceAll);

//Convert String into int
int convertedAmount = Integer.parseInt(replaceAll);

System.out.println(convertedAmount+rupees);

    }
}
