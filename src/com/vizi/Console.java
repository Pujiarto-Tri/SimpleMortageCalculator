package com.vizi;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);
//overloading method
    public static double readNumber(String prompt){
        return  scanner.nextDouble();
    }
//dont need to insert all the value bellow
    public static double readNumber(
            String prompt,
            double min,
            double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a number between " + min + " and " + max + "!.");
        }
        return value;
    }
}
