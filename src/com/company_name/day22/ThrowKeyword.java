package com.company_name.day22;

public class ThrowKeyword {

    /**
     * Example- throw an exception if age is below 18 (print "Access denied"). If age is 18 or older, print "Access granted"
     * @param age
     */
    static void checkAge(int age) {
        if (age< 18 )
        {
            throw new ArithmeticException("Access Denied");
        }
        else {
            System.out.println("Access Granted");
        }
    }

    public static void main(String[] args) {
        checkAge(17);
        System.out.println("Rest of the codes");
    }

}
