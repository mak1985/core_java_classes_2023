package com.company_name.day09;

public class Student {
    int roll; //non-static data member(also instance variable)
    String name; //non-static data member(also instance variable


    public static void main(String[] args) {
        //Create an object for the class - syntax: ClassName ref_var = new ClassNameConstructor();

        Student s1 = new Student(); //created an object with the help of new keyword
//        System.out.println(s1.name + s1.roll);
        System.out.println(s1.name); //default value = null for String
        System.out.println(s1.roll); //default value = 0 for int, short, long, byte datatype
        //default value = false for boolean datatype
    }
}
