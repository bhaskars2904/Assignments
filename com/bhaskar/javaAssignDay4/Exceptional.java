package com.bhaskar.javaAssignDay4;

import java.util.Scanner;
/**
 *This program builds three new exception which extends from
 * another new exception. It contains a try-catch to catch those
 * exceptions and a finally statement in case of a Null pointer exception
 */

public class Exceptional {
    public static void throwExceptions(int i) throws MainException{
        //Exceptions are thrown conditionally//
        if (i == 1) {
            throw new Exception1();
        }
        if (i == 2) {
            throw new Exception2();
        }
        if(i == 3) {
            throw new Exception3();
        }
        throw new NullPointerException();
    }

    public static void main(String[] args) {
        int i;
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter 1 for exception 1" + "\n" + "Enter 2 for exception 2" + "\n" + "Enter 3 for exception 3" + "\n" + "Enter anything else for null pointer exception");
            i = scan.nextInt();
            Exceptional.throwExceptions(i);
        } catch (MainException e) {
            e.f();
        }
        finally {
            System.out.println("Finally done");
        }
    }
}
