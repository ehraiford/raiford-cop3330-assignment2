/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex29;

import java.util.Scanner;

public class Solution29 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        rateManager rateCheck = new rateManager();
        String input = "";
        double rate = 0;
        boolean inputIsNumeric = false;
        //while loop continues until input can be converted into a double and is not 0
        while(inputIsNumeric == false || input.compareTo("0") == 0)
        {
            System.out.println("What is the rate of return?");
            input = in.next();
            inputIsNumeric = rateCheck.validateRate(input);
        }
        rate = Double.parseDouble(input);
        System.out.printf("It will take %.0f years to double your initial investment.", 72/rate);
    }
}
