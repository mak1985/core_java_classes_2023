package com.company_name.day21;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {

//        //1. Arithmetic exception
//
//        try {
//            int result = 100/0;
//        }
//        catch (ArithmeticException e)
//        {
//            System.out.println(e);
//        }
//
////        int result = 100/0;
////        System.out.println(result);
//        System.out.println("Handling exception");

        //2. NullPointerException

//        String s = null;
//        System.out.println(s.length());
//        System.out.println("Handled NullPointerException");
//        System.out.println("Handled NullPointerException");
//        System.out.println("Handled NullPointerException");
//        System.out.println("Handled NullPointerException");

//        try {
//            String s = null;
//            System.out.println(s.length());
//        }
//        catch (NullPointerException e)
//        {
//            System.out.println(e.toString());
//        }
//        System.out.println("Handled NullPointerException");
//        System.out.println("Handled NullPointerException");
//        System.out.println("Handled NullPointerException");
//        System.out.println("Handled NullPointerException");



        //4. ArrayIndexOutOfBoundException

//        System.out.println(a);

//        try {
//            int a[] = new int[5];
//            a[5]=5;
//            System.out.println("Checking");
//        }
//
//        catch (ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println("Catch block:" + e.toString());
//            System.out.println("Running my codes");
//        }
//        finally {
//            System.out.println("finally block executed");
//        }
//

        //        //3. NumberFormatExeception

//        System.out.println(a);


        try {
            int a = Integer.parseInt(null);
        }

        catch (NumberFormatException e)
        {
//            System.out.println(e);
            System.out.println("Next line execution 1");
            System.out.println("Next line execution 2");
        }
        finally {
            System.out.println("finally Next line execution 3");
        }
    }
}
