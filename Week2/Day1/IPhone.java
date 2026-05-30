package org.testleaf.week2.day1;

public class IPhone {

    //int numberOfPhotos=10;

 public void takeHQPhoto(int numberOfPhotos , String extensionType){
  System.out.println(numberOfPhotos+" "+extensionType);
 }

 public static void main(String[] args) {
    IPhone iphoneOptions=new IPhone();
    iphoneOptions.takeHQPhoto(10, "PNG");
    iphoneOptions.takeHQPhoto(50 , "JPEG");
 }

}
