package com.company_name.day11;

public class ConstructorWithParam {
    String car;
    int built_year;
    int x;
    //constructor with parameters

    ConstructorWithParam(String carName, int car_built_year)
    {
        //inilialize attributes
        car = carName;
        built_year = car_built_year;

    }

    ConstructorWithParam(){
        x = 10;
    }

    public static void main(String[] args) {
        ConstructorWithParam obj = new ConstructorWithParam("HondaCity", 2008); //insert the values

        //created class obj, this will call constructor  of class
        System.out.println(obj.car + " " +obj.built_year);
        System.out.println(obj.x);//10
    }


}
