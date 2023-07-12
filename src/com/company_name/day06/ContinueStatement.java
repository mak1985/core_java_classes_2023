package com.company_name.day06;

public class ContinueStatement {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++)
        {
            if (i == 5)
                continue; //skip the below immediate line of code
            System.out.println(i); //1, 2, 3, 4, 6,7,8,9,10
        }
    }
}
