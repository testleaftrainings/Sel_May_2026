package org.testleaf.week4.day1;

public class SBI implements RBI {

public void mandateKyc(){
System.out.println("Kyc is mandatory by PAN card");
}

public void regulateTransaction(){
System.out.println("regulate transaction above 10L");
}

public static void main(String args[]){
SBI sbiOptions = new SBI();
sbiOptions.mandateKyc();
sbiOptions.regulateTransaction();
}

}