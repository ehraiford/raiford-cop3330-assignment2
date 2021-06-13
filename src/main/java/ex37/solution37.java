/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex37;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class solution37 {

    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Character> password = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.println("What is the minimum length?");
        int min = in.nextInt();

        System.out.println("How many special characters?");
        int specials = in.nextInt();

        System.out.println("How many numbers?");
        int numbers = in.nextInt();
        int charType;
        //loops generating and adding the next character until all requirements are met
        while (password.size() < min || specials > 0 || numbers > 0 || password.size() < (numbers + specials)*2) {
            charType = rand.nextInt(4);
            if(charType == 0 && specials > 0) {
                password = addSpecial(password, rand);
                specials--;
            }else if(charType == 1 && numbers > 0) {
                password = addNumber(password, rand);
                numbers--;
            }else{
                password = addLetter(password, rand);
            }
        }

        System.out.println(formatString(password));
    }

    public static String formatString(ArrayList<Character> password) {
        String formattedPassword = "";

        for(int ticker = 0; ticker < password.size(); ticker++)
            formattedPassword = formattedPassword + password.get(ticker);

        return formattedPassword;
    }

    public static ArrayList<Character> addLetter(ArrayList<Character> password, Random rand) {
        char randLet = '1';

        //gets a random character continuously until it is a letter
        while(!Character.isAlphabetic(randLet))
            randLet = (char) (rand.nextInt(26) + 97);

        //50% chance for it to be uppercase
        if(rand.nextInt(2) == 1)
            randLet = Character.toUpperCase(randLet);

        password.add(randLet);
        return password;
    }

    public static ArrayList<Character> addNumber(ArrayList<Character> password, Random rand) {
        char randNum = 'a';
        //gets a random character continuously until it is a number
        while(!Character.isDigit(randNum))
            randNum = (char) (rand.nextInt(10) + 48);
        password.add(randNum);
        return password;
    }

    public static ArrayList<Character> addSpecial(ArrayList<Character> password, Random rand) {
        char randSpec = 'a';
        //gets a random character continuously until the random character is not a number or letter
        while(Character.isAlphabetic(randSpec) || Character.isDigit(randSpec))
            randSpec = (char) (rand.nextInt(95) + 33);
        password.add(randSpec);
        return password;
    }
}
