package com.company_name.day14;

class A //parent class
{
    int a;

    void display(){
        System.out.println("Class A : "+ a);
    }
}

//child class
class B  extends A{
    int b;
    void print(){
        System.out.println("Class B : "+ b);
    }
}



public class SingleLevelInheritance {
    public static void main(String[] args) {


        A objA = new A();
        objA.a = 20;
        objA.display();


        B objB = new B();
        objB.a = 55; //class A
        objB.display();//class A
        objB.b = 30; //Class B
        objB.print(); //Class B

    }
}
