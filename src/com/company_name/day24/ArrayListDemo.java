package com.company_name.day24;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //Declare ArrayList - approach 1
        ArrayList obj = new ArrayList(); //All types of data. (Homogeneous+heterogeneous)
        //Declare ArrayList - approach 2
        ArrayList <String> obj1 = new ArrayList<String>(); //Homogeneous
        //Adding data to ArrayList
        /**
         * 1. add(object)
         * 2. add(index,object)
         * 3. get(index) - Fetch the value
         * 4. set(index, object) - existing value update/change
         * 5. size() -
         * 6. clear() - clear all index values
         * 7. remove(index) - remove any specific index value
         * 8. contains(object) - returning true/false
         * 9. isEmpty() -> Return true/false
         * 10. addAll() - Add one collection to another collection
         * 11. removeAll() - To remove inserted collection
         */
        obj.add("Java"); //0th position
        obj.add(100); //1st position
        obj.add('A');
        obj.add(true);
        obj.add(12.4);
        obj.add("Java");
        obj.add(12.4);
        //print ArrayList
        System.out.println(obj);
        //print size
        System.out.println(obj.size());
        System.out.println(obj1.size());
        //remove
        obj.remove(6);
        System.out.println(obj);

        //get method
        System.out.println(obj.get(1));
        //set method
        obj.set(5, "C++");
        System.out.println(obj);

        System.out.println(obj.size());

        //Insert element in arrayList specific position
        obj.add(1, 1000);
        System.out.println(obj);

        //contains() -
        System.out.println(obj.contains("C++"));

        //isEmpty()
        System.out.println(obj.isEmpty());

        //clear()
        obj.clear();
        System.out.println(obj);
        System.out.println(obj.isEmpty());
    }
}
