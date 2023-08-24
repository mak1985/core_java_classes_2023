package com.company_name.day30;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        //HashMap hashMap = new HashMap();

        HashMap <Integer, String > hashMap1 = new HashMap<Integer, String>();
        hashMap1.put(100, "Tom");
        hashMap1.put(101, "Sam");
        hashMap1.put(102, "Tim");
        hashMap1.put(100, "Java");
        hashMap1.put(100, "JavaScript");
        hashMap1.put(103, "JavaScript");
        hashMap1.put(null, "C++");
        hashMap1.put(null, "C");
        hashMap1.put(105, null);
        hashMap1.put(106, null);
        hashMap1.put(107, null);

        System.out.println(hashMap1);

    }
}
