package com.company_name.day10;

public class Calculator {

    //1. Syntax of method
    //modifier_name returnType nameOfMethod(Parameter) { }

    //create static method
    static void printMessage() // void - no return type
    {
        System.out.println("Welcome to coding world - from static method");
    }

    //non-static method
    void printMessage1() // void - no return type
    {
        System.out.println("Welcome to coding world - from non-static method");
    }

    //method to sum two numbers
    static void sum(int a, int b) // parameterized
    {
        System.out.println("Sum of a + b" + (a+b));
    }

    //Return type method
    static int minimum(int a, int b) //Has return type as int
    {
        if (a < b) // If a is smaller than b
        return a;

        else
            return b; // If b is smaller

    }

    public static void main(String[] args) {
        //Calling static method without creating an object
        printMessage(); //static method
        //Created an object to call non-static method
        Calculator calc = new Calculator();
        calc.printMessage1(); //Non-static method

        sum(10, 20); //static method with parameter

        System.out.println(minimum(20, 10)); ////static method with parameter

    }

}
