package org.testleaf.week4.day1;

public class Edge extends Browser {

    public void launch(){
        super.launch();
        System.out.println("Launch Edge");
    }

    public static void main(String[] args) {
        Edge opt=new Edge();
        opt.launch();
    }

}
