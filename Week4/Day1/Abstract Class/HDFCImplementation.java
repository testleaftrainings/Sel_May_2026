package org.testleaf.week4.day1;

public class HDFCImplementation extends HDFC {


public void mandateKyc(){
System.out.println("mandateKyc");
}

public void regulateTransaction(){
System.out.println("mandateKyc");
}

public void regulateGoldLoan(){
    System.out.println("mandateKyc");
}

public static void main(String[] args) {
    HDFCImplementation opt=new HDFCImplementation();
    opt.regulateCarLoan();
    opt.regulateGoldLoan();
    opt.regulateTransaction();
    opt.mandateKyc();
    }
}


