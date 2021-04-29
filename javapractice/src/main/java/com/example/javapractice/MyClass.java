package com.example.javapractice;

public class MyClass {
    public static void main(String[] args) {
        int change;
        change= getMilk(15, 40);
        System.out.println("Master your change is: "+change);
    }

    //    public static void getMilk(){
//        System.out.println("Open Door");
//        System.out.println("Walk to the store");
//        System.out.println("Buy milk on the ground floor");
//        System.out.println("Return home with the milk galore");
//    }
//    public static void getMilk(int numberOfCCartonsToBuy) {
//        System.out.println("Open Door");
//        System.out.println("Walk to the store");
//        System.out.println("Buy "+ numberOfCCartonsToBuy+" milk on the ground floor");
//        System.out.println("Return home with the milk galore");
//    }
    public static int getMilk(int numberOfCCartonsToBuy, int startingAmount) {
        System.out.println("Open Door");
        System.out.println("Walk to the store");
        System.out.println("Buy "+ numberOfCCartonsToBuy+" milk on the ground floor");
        System.out.println("Return home with the milk galore");
        return startingAmount-(numberOfCCartonsToBuy*2);
    }

}