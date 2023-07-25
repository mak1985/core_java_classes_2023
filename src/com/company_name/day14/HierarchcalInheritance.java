package com.company_name.day14;


class Parent{
    int a;
    void display()
    {
        System.out.println("Parent " + a);
    }
}

class Child1 extends Parent{
    int b;
    void displayChild1(){
        System.out.println("Child1 " + b);
    }
}

class Child2 extends Parent {
    int c;
    void displayChild2(){
        System.out.println("Child2" + c);
    }
}


public class HierarchcalInheritance {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.a = 100; //parent class
        c1.b = 200; //child1 class

        c1.display();
        c1.displayChild1();

        Child2 c2 = new Child2();
        c2.a = 300; //Parent
        c2.c = 400;
        c2.display(); //Parent
        c2.displayChild2();
    }

}
