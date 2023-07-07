package com.company_name.day03;

public class ArithmeticOperatorDemo {
    public static void main(String[] args) {

        //1. 	1. Arithmetic Operator - ( +, -, *, /, %, ++ and --)
        int a = 10; //initialized
        int b = 5;

        System.out.println(a+b); //15
        System.out.println(a-b);//5
        System.out.println(a*b); //50
        System.out.println(a/b);//2
        System.out.println(a%b); //0

        // ++  incremental operator
        /**
         * Note - Post increment: a++;   -----> First print the original value and then increase/decrease
         * Pre increment/declement ++/--a; ------------------> First increment/declrement then print the value
         */

        System.out.println(a++); //10 First print the original value
        System.out.println(a); // 10+1=11
        System.out.println(a++); //11
        System.out.println(a); //12



        // -- declement post
        System.out.println(b--); //5
        System.out.println(b); //4

        System.out.println(--b);//3
        //System.out.println(b);//5

        System.out.println(++a); //13
        System.out.println(a++); //13
        System.out.println(a);//14
        System.out.println(a--);//14
        System.out.println(a);//13

    }
}
