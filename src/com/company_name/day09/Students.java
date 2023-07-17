package com.company_name.day09;

public class Students {
    //instance variables
    String name;
    int rollno;

    //method to display information about students
    void displayInfo()
    {
        System.out.println(name); //instance variables
        System.out.println(rollno);
    }

    public static void main(String[] args) {

        Students student1 = new Students();
        Students student2 = new Students();

        //initialize object/store data to the object student1 using reference variable

        student1.name = "John";
        student1.rollno = 10;

        student2.name = "Paul";
        student2.rollno = 11;

        //print info of student1 & student2
        student1.displayInfo(); //Calling displayInfo() method
        student2.displayInfo(); //Calling displayInfo() method

    }
}
