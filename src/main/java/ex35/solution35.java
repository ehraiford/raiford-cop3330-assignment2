/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex35;

import java.util.ArrayList;
import java.util.Scanner;

public class solution35 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<String> contestants = new ArrayList<>();
        for(int ticker = 0; ticker < 5; ticker ++){
            System.out.println("Enter a name:");
            String name = in.nextLine();
            contestants = addContestant(name , contestants);
        }

        int winner = (int) Math.ceil(Math.random() * 5) - 1;
        System.out.println(winnerSelection(contestants, winner));
    }

    public static String winnerSelection(ArrayList<String> contestants, int winner) {
        return "The winner is... " + contestants.get(winner) + ".";
    }

    public static ArrayList<String> addContestant(String name, ArrayList<String> contestants) {
        if(name.compareTo("") != 0)
            contestants.add(name);
        return contestants;
    }
}
