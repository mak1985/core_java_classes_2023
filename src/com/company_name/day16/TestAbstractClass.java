package com.company_name.day16;

public class TestAbstractClass {

    public static void main(String[] args) {

        BikeClass obj = new Tvs();
        obj.start(); // non-abstract method
        obj.run(); //abstract method
        BikeClass.stop(); //static method
        System.out.println("---------------------------------------------");
        BikeClass obj2 = new Honda();
        obj2.start(); // non-abstract method
        obj2.run(); //abstract method
        BikeClass.stop(); //static method
        System.out.println("---------------------------------------------");
        BikeClass obj3 = new Yamaha();
        obj3.start(); // non-abstract method
        obj3.run(); //abstract method
        BikeClass.stop(); //static method


    }
}
