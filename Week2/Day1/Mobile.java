package org.testleaf.week2.day1;

public class Mobile {

public void makeCall(){
System.out.println("makeCall");
}

public void sendMessage(){
System.out.println("sendMessage");
}

    
public static void main(String[] args) {

//ClassName objectName=new ClassName();
Mobile mobileOptions=new Mobile();
mobileOptions.makeCall();
mobileOptions.sendMessage();

   }

}
