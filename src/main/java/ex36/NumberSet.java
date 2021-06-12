/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex36;

import java.util.ArrayList;

public class NumberSet {
    private ArrayList<Double> list = new ArrayList<>();
    private double average;
    private double minimum;
    private double maximum;
    private double deviation;

    public double getNumber(int spot){
        return list.get(spot);
    }
    public void setNumber(double number){
        this.list.add(number);
    }
    public String printList(){
        return list.toString();
    }

    private void calculateAverage() {
        this.average = 0;

        for(int ticker = 0; ticker < this.list.size(); ticker++)
            this.average = this.average + this.list.get(ticker);

        this.average = this.average / this.list.size();

        //rounds average to 2 decimals.
        this.average = Math.round(this.average * 100);
        this.average = this.average / 100;
    }
    public double getAverage(){
        return average;
    }

    private void calculateMax(){
        this.maximum = this.list.get(0);
        //iterates list replacing maximum if value < current maximum
        for(int ticker = 0; ticker < this.list.size(); ticker++){
            if(this.list.get(ticker) > this.maximum)
                this.maximum = this.list.get(ticker);
        }
    }
    public double getMax(){
        return maximum;
    }

    private void calculateMin(){
        this.minimum = this.list.get(0);
        //iterates list replacing minimum if value < current minimum
        for(int ticker = 0; ticker < this.list.size(); ticker++){
            if(this.list.get(ticker) < this.minimum)
                this.minimum = this.list.get(ticker);
        }
    }
    public double getMin(){
        return minimum;
    }

    private void calculateDeviation(){
        this.deviation = 0;
        //for loop adds up each number - average squared
        for(int ticker = 0; ticker < this.list.size(); ticker++){
           this.deviation = this.deviation + Math.pow((this.list.get(ticker) - this.average), 2);
        }
        //application of second half of the formula
        this.deviation = this.deviation / this.list.size();
        this.deviation = Math.sqrt(this.deviation);
        //rounds to two places
        this.deviation = Math.round(this.deviation * 100);
        this.deviation = this.deviation / 100;
    }
    public double getDeviation(){
        return deviation;
    }

    public void calculateStats(){
        calculateMin();
        calculateMax();
        calculateAverage();
        calculateDeviation();
    }
}