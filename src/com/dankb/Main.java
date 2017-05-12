package com.dankb;

public class Main {

    public static void main(String[] args) {
        int myIntValue =  5;
        int testIntDivision = 5 / 2;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("The testIntDivision = " + testIntDivision);

        //float has 7 decimal point precision
        System.out.println("myFloatValue = " + myFloatValue);

        //double has 16 decimal point precision
        System.out.println("myDoubleValue = " + myDoubleValue);

        //challenge

        double pounds = 10d;
        double kilograms = pounds * 0.45359237d;
        System.out.println(" 10 pounds  = " + kilograms + " kilograms");
    }
}
