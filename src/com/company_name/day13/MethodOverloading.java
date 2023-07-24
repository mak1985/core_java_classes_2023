package com.company_name.day13;

public class MethodOverloading {
    /**
     * //In method overloading, multiple methods can have
     * 1. same name
     * 2. different parameters numbers
     * 3. different data types
     */

    void add(int a, int b) {
        System.out.println("1st method" + (a+b));
    }

    void add(double a, double b){
        System.out.println("2nd method" + (a+b));
    }

    void add(int a, double b){
        System.out.println("3rd method" + (a+b));
    }

    void add(int a, int b, int c){
        System.out.println("4th method" + (a+b+c));
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.add(10, 20);//30
        obj.add(10, 20.0);//30.0
        obj.add(10.0, 20.0);//30.0
        obj.add(10,20,30);//60



    }
}
