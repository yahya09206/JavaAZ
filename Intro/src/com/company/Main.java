package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello Yahya");

        //Declare a Variable
//        int myFirstNumber = (10 + 5) + (2 * 10);
//        int mySecondNumber = 40;
//        int myThirdNumber = myFirstNumber * 2;
//        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
//        int myLastOne = 1000 - myTotal;
        //Print out value of myFirstNumber®
//        System.out.println(myTotal);
//        System.out.println(myLastOne);

        //Int Byte Short
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min value = " + (myMinIntValue - 1));

        //Byte
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        //Short
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        //Long
        long myLongValue = 100l;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647;
        System.out.println(bigLongLiteralValue);

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShorValue = (short) (myMinShortValue / 2);

        byte newByte = 32;
        short newShort = 23443;
        int newInt = 332343;
        int newSum = newByte + newShort + newInt;
        long newLong = 50000 + (10 * newSum);
        System.out.println(newLong);

        //Floating point numbers
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        //Double values
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d / 2d;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        //Conversion Challenge
        double pounds = 120;
        double conversion = pounds * 0.45359237;
        System.out.println(conversion);

        double pi = 3.1415927d;
        System.out.println(pi);

        //Char and Boolean primitive types
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyright = '\u00A9';
        System.out.println(myCopyright);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;

        //Strings
        String myString = "This is a string";
        System.out.println("myString is equal to  " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);

        //Operators
        int result = 1 + 2;
    }
}
