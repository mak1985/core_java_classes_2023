package com.company_name.day12;

public class StaticBlockDemo {

    static void print()
    {
        System.out.println("This is my method");
    }

    public static void main(String[] args) {
        print();
        System.out.println("Print main method");

    }

    static { //static block
        System.out.println("This is my static block");
    }
}
