package com.company_name.day16;

public abstract class BikeClass {

    //Constractor
    BikeClass(){
        System.out.println("Bike class created");
    }

    //create abstract method
   abstract void run(); //abstract method does not have body

    //non-abstract method has body
    void start()
    {
        System.out.println("Bike started");
    }

    //create static method
    static void stop(){
        System.out.println("Bike stopped");
    }

}

class Tvs extends BikeClass {

    void run()
    {
        System.out.println("TVS child class run implementation to the method body");
    }
}

class Honda extends BikeClass {

    void run() {
        System.out.println("Honda child run implementation to the method body");
    }
}

class Yamaha extends BikeClass {


    @Override
    void run() {
        System.out.println("Yamaha child run implementation to the method body");
    }
}





