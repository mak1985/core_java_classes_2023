package com.company_name.day18;

public class Hacker {
    public static void main(String[] args) {

        EmployeeData obj = new EmployeeData();
        obj.setEmp_name("Tom");
        obj.setEmp_age(10);
        obj.setSsn(1223331);
        System.out.println("Emp name is : " + obj.getEmp_name());//Tom
        System.out.println("Emp age is :" + obj.getEmp_age());//10
        System.out.println("Emp ssn is :" + obj.getSsn());//1223331

    }
}
