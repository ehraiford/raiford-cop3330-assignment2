/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex34;

import java.util.ArrayList;
import java.util.Scanner;

public class solution34 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        ArrayList<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        System.out.println(detailEmployees(employees));
        System.out.println("Enter an employee name to remove:");

        String removed = in.nextLine();

       employees =  removeEmployee(employees, removed);
       System.out.println(detailEmployees(employees));
    }

    public static ArrayList<String> removeEmployee(ArrayList<String> employees, String removed) {
        if(!employees.remove(removed))
            System.out.println("That employee does not exist.\n");
        else
            System.out.println();
        return employees;
    }

    public static String detailEmployees(ArrayList<String> employees) {
        String employeeInfo = "There are " + employees.size() + " employees:\n";
        for(int ticker = 0; ticker < employees.size(); ticker++){//prints all employees on separate lines
            employeeInfo = employeeInfo + employees.get(ticker) + "\n";
        }
        return employeeInfo;
    }
}
