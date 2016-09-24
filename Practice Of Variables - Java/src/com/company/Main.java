package com.company;

import java.math.BigDecimal;

public class Main {

    static boolean b3;

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello from Java!");
//        System.out.println(args[0]);
        String aString = "Muhammad Khan";
        System.out.println("Your name is " + aString);

        byte b = 1;
        short s = 1;
        int i = 1;
        long l = 1L;

        float f = 1f;
        double d = 1d;

        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);

        byte by = 127;
        System.out.println("Byte: " + by);

        if (by < Byte.MAX_VALUE) {
            by++;
        }

        System.out.println("Byte: " + by);

        double value = 0.012;
        double myValue = value + value + value;
        System.out.println("Sum of primitives " + myValue);

        String strValue = Double.toString(value);
        System.out.println("strValue " + strValue);
        BigDecimal bigValue = new BigDecimal(strValue);

        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);
        System.out.println("Sum of BigDecimale " + bSum.toString());

        int intValue1 = 56;
        int intValue2 = intValue1;
        System.out.println("The 2nd value is " + intValue2);

        long longValue = intValue1;
        System.out.println("The long value is " + longValue);

        short shortValue1 = (short)intValue1;
        System.out.println("The short value is " + shortValue1);

        int intValue3 = 1024;
        byte byteValue = (byte) intValue3;
        System.out.println("The byte value is " + byteValue);

        double doubleValue = 3.999999d;
        int intValue4 = (int) doubleValue;
        System.out.println("Double to int " + doubleValue);

        int result1 = intValue1 + intValue2;
        System.out.println("Addition " + result1);

        int result2 = intValue1 - intValue2;
        System.out.println("Subtraction " + result2);

        int result3 = intValue1 * intValue2;
        System.out.println("Multiplication " + result3);

        double result4 = (double) intValue1 / intValue2;
        System.out.println("Division " + result4);

        double result5 = (double) intValue1 % intValue2;
        System.out.println("Remainder " + result5);

        long rounded = Math.round(doubleValue);
        System.out.println("Rounded " + doubleValue);

        double absValue = Math.abs(doubleValue);
        System.out.println("Absolute " + absValue);

        boolean b1 = true;
        boolean b2 = false;

        System.out.println("The value of b1 is " + b1);
        System.out.println("The value of b2 is " + b2);
        System.out.println("The value of b3 is " + b3);

        boolean b4 = !b1;
        System.out.println("The value of b4 is " + b4);

        int i1 = 0;
        boolean b5 = (i1 != 0);
        System.out.println("The value of b5 " + b5);

        String sBoolean = "true";
        boolean parsed = Boolean.parseBoolean(sBoolean);
        System.out.println("Parsed " + parsed);

        char c1 = '1';
        char c2 = '2';
        char c3 = '3';
        System.out.println("Char 1 is " + c1);
        System.out.println("Char 2 is " + c2);
        System.out.println("Char 3 is " + c3);

        char a1 = 'a';
        char a2 = 'b';
        char a3 = 'c';
        System.out.print(Character.toUpperCase(a1));
        System.out.print(Character.toUpperCase(a2));
        System.out.println(Character.toUpperCase(a3));
    }
}