package com.company_name.day19;

class EmpInfo{

    int empId;
    String name;
    double salary;
    String designation;

    EmpInfo(int empId,String name,double salary, String designation){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.designation = designation;

    }

    void display(){
        System.out.println(empId+ " "+name+ " "+salary+ " "+designation);
    }

}
public class Employee {
    public static void main(String[] args) {

        EmpInfo obj = new EmpInfo(10, "John", 1000.00, "QA");
        obj.display();//0, null, 0.0, null

    }


}
