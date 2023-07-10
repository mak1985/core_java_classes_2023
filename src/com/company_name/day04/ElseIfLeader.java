package com.company_name.day04;

public class ElseIfLeader {
    public static void main(String[] args) {

        int day = 0;
        //String month = "January";

        if ( day ==1 )  //1st condition
        {
            System.out.println("Today is Sunday");
        } else if ( day ==2) {
            System.out.println("Today is Monday");
        } else if (day == 3) {
            System.out.println("Today is Tue");
        } else if (day == 4) {
            System.out.println("Today is Wed");
        } else if (day == 5) {
            System.out.println("Today is Thu");
        } else if (day ==6) {
            System.out.println("Today is fri");
        } else if (day == 7) {
            System.out.println("Today is Sat");
        }
        else
        {
            System.out.println("Invalid entry");
            //In case of all above conditions not meet then execute else condition
        }
    }
}
