/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex31;

import java.util.Scanner;

public class solution31 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Person target = new Person();

        target.age = receiveInt(in, "Enter your age.");
        target.restingRate =receiveInt(in, "Enter your resting heart rate.");

       target.generateOutput();

    }

    private static int receiveInt(Scanner in, String prompt) {
        System.out.println(prompt);
        int input;
        while(true) {
            try {
                input = in.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Error with input. " + e);
                System.out.println("Input must be an integer.");
                in.next();
            }
        }
        return input;
    }

}
