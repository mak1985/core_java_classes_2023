package com.company_name.day09;

public class Students_2 {

    //instance variables
    String name;
    int id;

    //method to insert record of Students
    void insertRecord(String studentName, int studentId)
    {
        name = studentName;
        id = studentId;

    }

    //method to display student info
    void displayInfo()
    {
        System.out.println(name);
        System.out.println(id);
    }

}
