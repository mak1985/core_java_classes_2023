package com.company_name.day06;

public class BreakStatement {
    public static void main(String[] args) {

        for (int i = 1; i <=10; i++)
        {
            if (i == 5)
                break; //Exit from the loop
            System.out.println(i); //1, 2, 3 & 4
        }
    }
}
