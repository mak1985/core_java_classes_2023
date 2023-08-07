package com.company_name.day22;

import java.io.IOException;

public class ThrowsKeyword {

    static void checkAge(int age) throws IOException, ArrayIndexOutOfBoundsException, NumberFormatException, NullPointerException {

        if (age <18)
        {
            throw new ArithmeticException("Access denied");

        }
        else {
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(17);
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }

        System.out.println("Rest of the codes");
    }






}
