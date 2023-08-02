package com.company_name.day19;


class Animal {
    String color = "White";
}

class Dog extends Animal {
    String color = "Black";

    void printColor(){
        System.out.println(color); //print color of dog class which is black
        System.out.println(super.color);//print color of Animal class which is White
    }

}

public class SuperKeyword {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.printColor();
    }
}
