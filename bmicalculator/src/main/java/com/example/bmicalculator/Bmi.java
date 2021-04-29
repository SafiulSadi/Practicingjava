package com.example.bmicalculator;

public class Bmi {
    public static void main(String[] args) {
        bmiCalc(1.6,75);
    }
    public static void bmiCalc(double height, int weight){
        double bmi=weight/(height*height);
        if(bmi>25){
            System.out.println("you are overweight");
        }
        else if(bmi>18.5){
            System.out.println("you are normal weight");
        }
        else
            System.out.println("you are under weight");
    }
}