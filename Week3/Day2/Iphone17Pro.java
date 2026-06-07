package org.testleaf.week3.day2;
//           child       extends parent
public class Iphone17Pro extends Iphone{

    public void useAI(){
        System.out.println("useAI");
    }

    public static void main(String[] args) {
        Iphone17Pro opt=new Iphone17Pro();
        opt.useAI();
        opt.takeHqPhoto();
        opt.takePhoto();
    }

}
