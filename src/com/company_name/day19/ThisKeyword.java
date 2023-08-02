package com.company_name.day19;

public class ThisKeyword {

   int x; //instance variable


    public ThisKeyword(int x)  //local 'x' variable
    {
        this.x =x;
    }

    public void show(){
        int x = 21; //local variable
        System.out.println(x);
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword(10);
        obj.show();
    }
}
