/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex30;

public class TableOutput {
    String formatting(int number){
        if(number >= 100)
            return " ";
        if(number >= 10)
            return "  ";
        return "   ";
    }
}
