package com.getName;

import java.util.Scanner;

public class JyCommands {
    public static void printCommand(String printStr) {
        System.out.println(printStr);
    }
    public static void math(String type, int a, int b) {
        if (type.equals("+")) {
            int sum = a + b;
            System.out.println(sum);
        }
        if (type.equals("-")) {
            int sum = a - b;
            System.out.println(sum);
        }
        if (type.equals("*")) {
            int sum = a * b;
            System.out.println(sum);
        }
        if (type.equals("/")) {
            int sum = a / b;
            System.out.println(sum);
        }
    }
    public static void userInput() {
        Scanner userInput = new Scanner(System.in);
        String getUserInput = userInput.nextLine();
    }
}