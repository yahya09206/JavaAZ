package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello Yahya");

        //Declare a Variable
        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 40;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = 1000 - myTotal;
        //Print out value of myFirstNumber®
        System.out.println(myTotal);
        System.out.println(myLastOne);

        //Int Byte Short
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min value = " + (myMinIntValue - 1));

    }
}
