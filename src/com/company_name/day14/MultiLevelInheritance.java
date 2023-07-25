package com.company_name.day14;


class GFather{
    int a;

    void display()
    {
        System.out.println("GFather :" + a);
    }
}

class Father extends GFather{
    int b;
    void print()
    {
        System.out.println("Father" + b);
    }
}

class Son extends Father{
    int c;
    void show()
    {
        System.out.println("Son" + c);
    }
}



public class MultiLevelInheritance {
    public static void main(String[] args) {

        Son obj = new Son();
        obj.a = 10; //from GFather
        obj.b = 20; ////from Father
        obj.c = 30; //own

        obj.display();//from GFather
        obj.print(); ////from Father
        obj.show();//own
        //own+father+gfather
    }
}
