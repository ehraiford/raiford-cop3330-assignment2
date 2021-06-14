/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex39;


import java.util.*;

public class solution39 {
    public static void main(String[] args) {
        List<HashMap> employees = new ArrayList<>();
        employees = createArrayList(employees);

      //  Collections.sort(employees, mapComparator);


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

    private static Comparator<Map<String, String>> mapComparator = new Comparator<Map<String, String>>() {
        public int compare(Map<String, String> original, Map<String, String> compare) {
            return original.get("Last").compareTo(compare.get("Last"));
        }
    };
}
