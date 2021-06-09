/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex26;

import java.util.Scanner;

public class Solution26 {
    public static void main(String[] args){
        PaymentCalculator calc = new PaymentCalculator();
        Scanner in = new Scanner(System.in);

        double balance = receiveInput(in, "What is the credit card balance?");
        balance = Math.ceil(balance * 100) / 100;
        double apr = receiveInput(in, "What is the APR of the card?");
        double monthlyPayment = receiveInput(in, "What is the monthly payment?");
        monthlyPayment = Math.ceil(monthlyPayment * 100) / 100;

        double answer = calc.calculateMonthsUntilPaidOff(balance, monthlyPayment, apr  );
        System.out.println(answer);

    }
    public static int receiveInput(Scanner in, String prompt){
        System.out.println(prompt);
        return in.nextInt();
    }
}
