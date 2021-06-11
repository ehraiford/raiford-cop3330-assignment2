/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex29;

import java.util.InputMismatchException;
import java.util.Scanner;

public class rateManager {
    public boolean validateRate(String input){
        boolean check = false;

        try{
            Double.parseDouble(input);
            check = true;
        }catch(Exception e) {
            System.out.println("Rate must be a numeric value above 0.");
        }
        return check;
    }
}
