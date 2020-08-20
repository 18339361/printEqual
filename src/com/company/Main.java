package com.company;
//Program to check if given parameters are equal/different

public class Main {
    //starting point
    public static void main(String[] args) {
//	    printEqual(1,1,1);
        System.out.println(isCatPlaying(true,10));
    }

    //printEqual() for checking input
    public static void printEqual(int num1, int num2, int num3){
        if(num1==num2 && num2==num3){
            System.out.println("All numbers are equal");
        }
        else if(num1!=num2 && num2!=num3){
            System.out.println("All numbers are different");
        }
        else{
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean result;
        if(summer && temperature>=25 && temperature<=45){
            result=true;
        }
        else if(!summer && temperature>=25 && temperature<=35){
            result= true;
        }
        else{
            result=false;
        }
        return result;
    }
}
