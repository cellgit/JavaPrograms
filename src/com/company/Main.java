package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        byteShortInt();
    }


    public static void byteShortInt() {
        int myValue = 1000;
        // int has a width of 32
        int myMinValue = -2_147_483_648;    // -214748364
        int myMaxValue = 2_147_483_647;     // 214748364

        // byte has a width of 8
        byte myByteValue = -128;

        // short has a width of 16
        short myShortValue = 32767;

        // long has a width of 64
        long myLongValue = 9_223_372_036_854_775_807L;


        System.out.println("myValue(int has a width of 32)====:" + myValue);
        System.out.println("myMinValue(int has a width of 32)====:" + myMinValue);
        System.out.println("myMaxValue(int has a width of 32)====:" + myMaxValue);

        System.out.println("myByteValue(byte has a width of 8)====:" + myByteValue);
        System.out.println("myShortValue(short has a width of 16)====:" + myShortValue);
        System.out.println("myLongValue(long has a width of 64)====:" + myLongValue);


        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println("longTotal = " + longTotal);

        long longDiv = 50000L + 80L / (byteValue + shortValue + intValue);
        System.out.println("longDiv = " + longDiv);


        long longDiv2 = 50000L + 80L / 2;
        long myLongDiv = (myLongValue / 2);
//        short myShortDiv = (myShortValue / 2);
//        short shortMulti = 1000 + 10 * (byteValue + shortValue + intValue);
        short shortMulti = (short) (1000 + 10 * (byteValue + shortValue + intValue));

        System.out.println("longDiv2 = " + longDiv2);
        System.out.println("myLongDiv = " + myLongDiv);
        System.out.println("shortMulti = " + shortMulti);
    }















}
