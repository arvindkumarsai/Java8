package com.karan.practice.practice.java8.interfces;

interface Interface1{
    default void show(){
        System.out.println("Default TestInterface1");
    }
}
interface Interface2{
    default void show(){
        System.out.println("Default TestInterface2");
    }
}
public class ExampleDefaultInterface implements Interface1,Interface2{


   public void show()
   {
       Interface1.super.show();
       Interface2.super.show();
   }
    public static void main(String[] args) {

        ExampleDefaultInterface inter = new ExampleDefaultInterface();
        inter.show();
    }

}
