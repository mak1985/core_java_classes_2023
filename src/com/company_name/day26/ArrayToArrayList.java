package com.company_name.day26;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void main(String[] args) {
//        How to create arrayList from array
//        ----------------------------------
        String cars[] = {"Honda", "BMW", "Ford"};

        ArrayList obj = new ArrayList(Arrays.asList(cars));
        System.out.println(obj);
    }
}
