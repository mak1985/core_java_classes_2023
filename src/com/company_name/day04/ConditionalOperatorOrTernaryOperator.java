package com.company_name.day04;

public class ConditionalOperatorOrTernaryOperator {
    public static void main(String[] args) {
        //4. ConditionalOperatorOrTernaryOperator
        /**
         * Syntax: datatype variable_name = condition ? expression1: expression2
         */

        int a = 50;
        int b = 100;

        int check_minimum = a < b ? a : b;
        int check_maximum = a > b ? a : b;

        System.out.println(check_minimum); //50
        System.out.println(check_maximum); //100

    }
}
