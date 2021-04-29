package com.example.couldthisbelove;

import java.util.Random;

public class LoveCalulator {
    public static void main(String[] args) {
        System.out.println("Hello! your love score is: "+ ifYouHadMyLove("Mr. x","Miss. y"));

    }
    public static int ifYouHadMyLove(String yourName, String theirName){
        Random randomObj= new Random();
        int loveScore=randomObj.nextInt(100);
        if(loveScore>80){
            System.out.println(yourName+ " and "+theirName+" you love each other like Kanye loves Kanye");
        }
        else if(loveScore>40){
            System.out.println(yourName+ " and "+theirName+ " go thogether like coke and mentos");
        }
        else
            System.out.println("No love is possible");
        return loveScore;
    }
}