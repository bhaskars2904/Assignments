package com.bhaskar.javaAssignDay5;

import java.util.Scanner;

/**
 * This program takes a String as user input
 * and checks if it begins with a capital letter
 * and ends with a period
 */

public class StringMatcher {
    public static void main(String[] args) {
      System.out.println("Enter a string to be checked for");
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        if(userInput.matches("^[A-Z].*[.]"))
                System.out.println("Pattern Matches");
            else
                System.out.println("Pattern doesn't match");
    }
}
