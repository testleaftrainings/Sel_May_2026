package org.testleaf.week4.day1;

public class Axis implements RBI {

public void mandateKyc(){
System.out.println("Kyc is mandatory by AADHAR");
}

public void regulateTransaction(){
System.out.println("regulate transaction above 5L");
}

public static void main(String[] args) {
    Axis axisOptions=new Axis();
    axisOptions.mandateKyc();
    axisOptions.regulateTransaction();
}

}
