/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex36;

import java.util.Scanner;

public class solution36 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        NumberSet list = new NumberSet();

        String input = "";
        //continuously receives inputs until user enters "done"
        while(input.compareTo("done") !=0){
            System.out.println("Enter a number.");
            input = in.nextLine();
            list = addInput(list, input);
        }

        list.calculateStats();

        System.out.println("The average is " + list.getAverage() + ".");
        System.out.println("The minimum is " + list.getMin() + ".");
        System.out.println("The maximum is " + list.getMax() + ".");
        System.out.println("The standard deviation is " + list.getDeviation() + ".");
    }

    //if input is not a valid double, it isn't added to the list.
    public static NumberSet addInput(NumberSet list, String input) {
        try{
            double number = Double.parseDouble(input);
            list.setNumber(number);
        }catch(Exception e){
            System.out.println("Input must be a number.");
        }
        return list;
    }
}
