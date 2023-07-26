package com.company_name.day15;


public class MethodOverriding {
    public static void main(String[] args) {

        Rbi rbi = new Rbi();
        System.out.println("Rbi RIO" + rbi.getRoi()); //8.0;

        Hdfc objHdfc = new Hdfc();
        System.out.println("Hdfc ROI" + objHdfc.getRoi()); //6.5;

        Icici objIcici = new Icici();
        System.out.println("Icici ROI" + objIcici.getRoi());//7.5;

        Sbi objSbi = new Sbi();
        System.out.println("Sbi ROI" + objSbi.getRoi());//5.8;
    }
}


