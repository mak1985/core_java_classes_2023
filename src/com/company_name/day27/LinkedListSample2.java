package com.company_name.day27;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSample2 {
    public static void main(String[] args) {
        //creating linkedlist for String
        LinkedList <String> cars = new LinkedList<>();
        //add elements to linkedlist
        cars.add("Maruti");
        cars.add("Honda");
        cars.add("Hyundai");

        System.out.println("Before addFirst method " + cars);//[Maruti, Honda, Hyundai]

        //addFirst()
        cars.addFirst("Jeep");
        System.out.println(cars);//Jeep, Maruti, Honda, Hyundai

        //addLast()
        cars.addLast("Jeep");
        System.out.println(cars);

        //removeFirst()
        cars.removeFirst();
        System.out.println(cars);

        //removeLast
        cars.removeLast();
        System.out.println(cars);

        //getFirst() & getLast()
        System.out.println(cars.getFirst());//Maruti
        System.out.println(cars.getLast());//Hyundai

        //push method
        cars.add("Maruti2");
        cars.add("Honda2");
        cars.add("BMW");
        System.out.println(cars); //[Maruti, Honda, Hyundai, Maruti2, Honda2, BMW]

        cars.push("Damage car");
        System.out.println(cars);
        cars.push("Damage car1");
        System.out.println(cars); //[Damage car1, Damage car, Maruti, Honda, Hyundai, Maruti2, Honda2, BMW]
        //pop method
        System.out.println(cars.pop());//Damage car1

        //peek method
        System.out.println(cars);//[Damage car, Maruti, Honda, Hyundai, Maruti2, Honda2, BMW]
        System.out.println(cars.peek());
        System.out.println(cars);
        System.out.println(cars.peekFirst());//Damage car
        System.out.println(cars.peekLast());//BMW

        //Reading elements from linkedlist
        /**
         * for loop
         * for each loop
         * interator method
         */
        //Reading elements from LinkedList using for loop
//        for (int i = 0; i<cars.size(); i++) {
//            System.out.println(cars.get(i));
//        }
//
//        //for each loop
//        for (Object e : cars) {
//            System.out.println(e);
//        }
                Iterator it = cars.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Collections.sort(cars);
        System.out.println("After sorting " + cars);

        Collections.sort(cars, Collections.reverseOrder());
        System.out.println("After reverse order sorting " + cars);

        Collections.shuffle(cars);
        System.out.println("After shuffling " +cars);
    }
}
