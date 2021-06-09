/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex27;

import java.util.Scanner;

public class Solution27 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        inputValidation check = new inputValidation();
        String firstN = receiveInput(in, "What is the first name?");
        String lastN = receiveInput(in, "What is the last name?");
        String id = receiveInput(in, "What is the employee ID? ");
        String zip = receiveInput(in, "What is the ZIP code?");

        String rFirst= inputValidation.firstNameValidator(firstN);
        String rLast = inputValidation.lastNameValidator(lastN);
        String rid = inputValidation.IDValidator(id);
        String rzip = inputValidation.zipValidator(zip);

        String out = rFirst + rLast + rid + rzip;
        if(out.compareTo("") == 0)
            out = "There were no errors found.";
        System.out.println(out);

    }

    private static String receiveInput(Scanner in, String prompt) {
        System.out.println(prompt);
        return in.nextLine();
    }


}
