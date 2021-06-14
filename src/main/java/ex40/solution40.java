/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex40;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class solution40 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        List<HashMap> employees = new ArrayList<>();
        employees = createArrayList(employees);

        System.out.println("Enter a search String:");
        String received = in.nextLine();

        System.out.println("Results:\n\nName                    | Position               |Separation Date");
        System.out.println("________________________|________________________|________________________");
        for(int ticker = 0; ticker < employees.size(); ticker++){
           boolean isInstance = confirmInstance(received, employees.get(ticker));
           if(isInstance == true)
               printInfo(employees.get(ticker));
        }

    }

    //just prints out information about the employee given to it
    public static void printInfo(HashMap employee) {
        System.out.print(employee.get("First") + " " + employee.get("Last"));
        String nameOutput = employee.get("First").toString()  + " " + employee.get("Last").toString();
        System.out.print(generateSpace(nameOutput));
        System.out.print("|" + employee.get("Position").toString());
        String positionOutput = employee.get("Position").toString();
        System.out.print(generateSpace(positionOutput));
        System.out.print("|" + employee.get("Separation") + "\n");
    }

    //generates string with space characters to format the list
    //written to handle up to 24 characters, big enough for
    //all employees from the example but would not work for much larger strings
    public static String generateSpace(String string) {
        int numNeeded = 24 - string.length();

        String spaces = "";
        for(int ticker = 0; ticker < numNeeded; ticker++)
            spaces = spaces + " ";
        return spaces;
    }

    public static boolean confirmInstance(String received, HashMap employee) {
            if(employee.get("First").toString().contains(received)||employee.get("Last").toString().contains(received))
              return true;
            else
                return false;
    }


    //creates employee maps and puts it in the ArrayList. Done in separate method to keep main shorter.
    private static List<HashMap> createArrayList(List<HashMap> employees) {

        HashMap<String,String> johnson = new HashMap<>();
        johnson.put("First", "John");
        johnson.put("Last", "Johnson");
        johnson.put("Position", "Manager");
        johnson.put("Separation", "2016-12-31");
        employees.add(johnson);

        HashMap<String, String> xiong = new HashMap<>();
        xiong.put("First", "Tou");
        xiong.put("Last", "Xiong");
        xiong.put("Position", "Software Engineer");
        xiong.put("Separation", "2015-12-19");
        employees.add(xiong);

        HashMap<String, String> michaelson = new HashMap<>();
        michaelson.put("First", "Michaela");
        michaelson.put("Last", "Michaelson");
        michaelson.put("Position", "District Manager");
        michaelson.put("Separation", "2015-12-19");
        employees.add(michaelson);

        HashMap<String, String> jacobson = new HashMap<>();
        jacobson.put("First", "Jake");
        jacobson.put("Last", "Jacobson");
        jacobson.put("Position", "Programmer");
        jacobson.put("Separation", "");
        employees.add(jacobson);

        HashMap<String, String> jackson = new HashMap<>();
        jackson.put("First", "Jacquelyn");
        jackson.put("Last", "Jackson");
        jackson.put("Position", "DBA");
        jackson.put("Separation", "");
        employees.add(jackson);

        HashMap<String, String> webber = new HashMap<>();
        webber.put("First", "Sally");
        webber.put("Last", "Webber");
        webber.put("Position", "Web Developer");
        webber.put("Separation", "2015-12-18");
        employees.add(webber);

        return employees;
    }
}
