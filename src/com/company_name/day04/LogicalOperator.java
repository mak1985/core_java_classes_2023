package com.company_name.day04;

public class LogicalOperator {
    public static void main(String[] args) {
        //3. Logical operators - &&, || , !

        /**
         * Note - || OR - It returns true either of the boolean expressions is true
         *
         * && (AND) - It returns true if both the boolean expressions are true
         */
        boolean x = true;
        boolean y = true;

        System.out.println( x && y ); //false //true
        System.out.println( x || y ); //true
        System.out.println( !x); //true
        System.out.println(!y); // false
    }
}
