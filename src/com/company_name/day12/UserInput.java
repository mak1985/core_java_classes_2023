package com.company_name.day12;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Enter user name, age, salary");

        //craete an object of scanner class
        Scanner obj = new Scanner(System.in);

        //String input for name
        String name = obj.nextLine();
        int age = obj.nextInt();
        double salary = obj.nextDouble();

        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
        System.out.println("Salary is : " + salary);
    }

}
