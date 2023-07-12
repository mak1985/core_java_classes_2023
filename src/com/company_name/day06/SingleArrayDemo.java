package com.company_name.day06;

public class SingleArrayDemo {
    public static void main(String[] args) {

        //declare and initialization/instantiation
        int [ ] roll_number = new int[5];

        //insert value in an array
        roll_number[0] = 12; // 1st element
        roll_number[1] = 13;
        roll_number[2] = 14;
        roll_number[3] = 15;
        roll_number[4] = 15;

        //print size of an array
        System.out.println("Size of an array : " + roll_number.length);

        //Read values from an array
        System.out.println("Value of 4th element: " + roll_number[3]); //15

        //Read all the values of an array - Traditional for loop
        for (int i = 0; i <roll_number.length; i++)
        {
            System.out.println("for loop :" + roll_number[i]);
        }

        //for each loop/enhanced for loop -Read all the values of an array
        for (int i : roll_number)
        {
            System.out.println("for each loop enhanced loop: " + i);
        }

    }
}
