/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex31;

public class Person {
    int age;
    int restingRate;

    void generateOutput(){

        System.out.println("Resting pulse: " + restingRate + "     Age: " + age);
        System.out.println("Intensity    | Rate");
        System.out.println("----------------------");

        for(int percent = 55; percent <= 95; percent = percent + 5){
            System.out.println(percent + "%          | "+ targetRate(percent) + " bpm");
        }
    }

    public int targetRate(int percent) {
        double rate = (220 - age - restingRate) * percent;
        rate = Math.round( rate / 100 + restingRate);
        return ((int) rate);
    }
}
