package com.company_name.day17;

interface showName {
    void showName(String name); // method is abstract &  public by default


}

interface showAge extends showName {

    void showAge(int age);

}




public class InterfaceDemo implements showAge, showName {


    public void showName(String name) {
        System.out.println("name is :" + name);
    }


    public void showAge(int age) {
        System.out.println("age is : "+ age);
    }

    public static void main(String[] args) {
        InterfaceDemo obj = new InterfaceDemo();
        obj.showName("Tom");
        obj.showAge(25);
    }
}
