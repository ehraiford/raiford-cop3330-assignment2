/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex33;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solution33 {
    public static void main(String[] args){
        Scanner in =  new Scanner(System.in);

        List answers = new ArrayList();
        answers.add("Yes.");
        answers.add("No.");
        answers.add("Ask again later.");

        int response = getRandomNumber();

        System.out.println("What's your question?");
        in.nextLine();
        //prints item on the list corresponding to the random number.
        System.out.println(generateResponse(response, answers));
    }

    public static String generateResponse(int response, List answers) {
        return answers.get(response).toString();
    }

    public static int getRandomNumber() {
        return (int) Math.ceil(Math.random() * 3) - 1;
    }
}
