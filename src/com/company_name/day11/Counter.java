package com.company_name.day11;

public class Counter {
    //class variables
//    int count = 0;

    static int count = 0;

    //Constructor
    Counter() {
        count++; //increment/decrement by 1
        System.out.println(count);

    }

    public static void main(String[] args) {
        Counter obj = new Counter();

    }

}
