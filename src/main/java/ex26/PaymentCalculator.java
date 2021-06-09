/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex26;

public class PaymentCalculator {
    public double calculateMonthsUntilPaidOff(double balance, double monthly, double apr) {
        double daily = (apr / 100) / 365;

        //math follows formula to find months. broken into multiple steps for legibility.
        double answer = Math.log((1 + (balance/monthly) * (1 - Math.pow((1 + daily), 30))));
        answer = answer / Math.log(1+daily) / -30;
        answer = Math.ceil(answer);


        return answer;
    }
}
