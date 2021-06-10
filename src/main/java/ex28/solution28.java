/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex28;

import java.util.Scanner;

public class solution28 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        AddNumbers numbers = new AddNumbers();
        int total = 0;

        for(int ticker = 0; ticker < 5; ticker++){
            System.out.println("Enter a number: ");
            int thisNumber = in.nextInt();
            total = numbers.findNewTotal(total, thisNumber);
        }
        System.out.println("The total is " + total + ".");
    }
}
