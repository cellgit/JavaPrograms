package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
	// write your code here

//        byteShortInt();
//        floatAndDouble();
//        charAndBoolean();
//        strings();

        /// lesson 40: minutes and seconds chanllenge
        System.out.println(getDuringString(65, 45));
        System.out.println(getDuringString(3945L));
        System.out.println(getDuringString(-41));
        System.out.println(getDuringString(65, 9));


        /// lesson 44: day of week
        printDayOfWeek(-1);
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
    }


    private static void printDayOfWeek (int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuseday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thurday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
    }


    private static String getDuringString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }


        String minutesString = remainingMinutes + "m";
        if (remainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondssString = seconds + "s";
        if (seconds < 10) {
            secondssString = "0" + secondssString;
        }




        return  hoursString + " " + minutesString + " " + secondssString + "";
    }

    private static String getDuringString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDuringString(minutes, remainingSeconds);
    }



    public static void strings() {
        String myString = "This is a string";
        System.out.println("This is a string: " + myString);

        myString = myString + "\u00A92015";
        System.out.println("Unicode String: " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The Result is: : " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("The lastString Result is: : " + lastString);

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("The doubleNumber lastString Result is: : " + lastString);
    }



    public static void charAndBoolean() {
        char myChar = '\u00A9';
        System.out.println("Unicode output was: " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        char registeredSymbol = '\u00AE';
        System.out.println(" The Second Unicode output was: " + registeredSymbol);
    }


    public static void floatAndDouble() {
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntvale = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("kilograms = " + convertedKilograms);

        double pi = 3_000_000.141_5927d;
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
