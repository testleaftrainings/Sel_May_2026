package org.testleaf.week3.day2;
//           Child  extends Parent
//           subclass       superclass
public class Iphone extends Mobile {

   public void takeHqPhoto(){
    System.out.println("takeHqPhoto");
   }

   public static void main(String[] args) {
        Iphone mobOpt=new Iphone();
        mobOpt.takeHqPhoto();
        mobOpt.takePhoto();
    }

}
