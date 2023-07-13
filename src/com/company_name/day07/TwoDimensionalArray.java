package com.company_name.day07;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        //Declare and instantiation array
        int [ ] [ ] a = new int [ 3] [2] ; // 3 rows and 2 columns

        //insert values in an array'
        a [0] [0] = 12;
        a [0] [1] = 13;

        a [1] [0] = 14;
        a [1] [1] = 15;

        a [2] [0] = 16;
        a [2] [1] = 17;

        //int [ ] [ ] a1 = {{12,13}, {14,15}, {16,17}};

        //print size of rows and columns
        System.out.println("No.of rows :" + a.length);
        System.out.println("No.of columns :" + a[0].length);

        //read values from an array using outer and inner for loop

//        for (int i = 0; i <a.length; i++) //outer for loop to read rows i=0; 1, 2
//
//        {
//            for (int j =0; j<a[0].length; j++)//inner for loop to read columns
//            {
//                System.out.println(a [i] [j]);
//            }
//        }

        //Read values from an array using enhanced for loop

        for (int [ ] rowValue : a) // row
        {
            for (int columnValue : rowValue) //col
            {
                System.out.println(columnValue);
            }
        }

    }
}
