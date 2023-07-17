package com.company_name.day09;

public class StudentMain {
    public static void main(String[] args) {

        //Create an object for Students_2 class
        Students_2 student1 = new Students_2();
        Students_2 student2 = new Students_2();

        //initialize an object
        student1.insertRecord("John", 10);
        student2.insertRecord("Paul", 11);

        //print student info
        student1.displayInfo();
        student2.displayInfo();

    }
}
