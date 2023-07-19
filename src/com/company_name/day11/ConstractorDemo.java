package com.company_name.day11;

public class ConstractorDemo {

    int x; //attribute of class


    ConstractorDemo(){ // Constructor without parameter
        //body
        //initiatize value of the class
        x = 10;

    }

    public static void main(String[] args) {
        ConstractorDemo obj = new ConstractorDemo();
        System.out.println(obj.x); //print value of x
    }

}
