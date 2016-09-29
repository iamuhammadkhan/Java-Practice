package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String s1 = "This is a String";
        System.out.println(s1);

        String s2 = new String("This is also a String");
        System.out.println(s2);

        String s3 = "Shirt size: ";
        String s4 = "M";
        String s5 = s3 + s4 + ", Qty: " + 4;
        System.out.println(s5);

        char [] chars = {'H', 'e', 'l', 'l', 'o'};
        System.out.println(chars);

        String s6 = new String(chars);
        System.out.println(s6);

        char [] chars1 = s6.toCharArray();
        for (char c : chars1){
            System.out.println(c);
        }

        int intValue = 42;
        String fromInt = Integer.toString(intValue);
        System.out.println(fromInt);

        boolean boolValue = true;
        String fromBool = Boolean.toString(boolValue);
        System.out.println(fromBool);

        long longValue = 10_000_000;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String formatted = formatter.format(longValue);
        System.out.println(formatted);

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + ", " + str2 + "!";
        System.out.println(str3);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", ");
        sb.append("World");
        sb.append("!");
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("Hello")
                .append(", ")
                .append("World")
                .append("!");
        System.out.println(sb1);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Value: ");
        String input = scanner.nextLine();
        System.out.println(input);

        sb.delete(0, sb.length());
        for (int i = 0; i < 3; i++) {
            input = scanner.nextLine();
            sb.append(input);
        }
        System.out.println(sb);

        for (int i = 0; i < 5; i++){
            System.out.println("*");
        }
    }
}
