/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex38;

import java.util.Scanner;

public class solution38 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a list of numbers, separated by spaces:");
        String input = in.nextLine();

        String[] userInput = input.split(" ");

        String evenNumbers = "The even numbers are";

        for(int ticker = 0; ticker < userInput.length; ticker++)
            evenNumbers = evenNumbers + filterEvenNumbers(userInput[ticker]);

        evenNumbers = evenNumbers + ".";

        System.out.println(evenNumbers);
    }

    public static String filterEvenNumbers(String number) {
        int numInt = Integer.parseInt(number);
        if(numInt % 2 == 0)
            return  " " + numInt;
        return "";
    }
}
