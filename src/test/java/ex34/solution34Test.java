/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex34;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class solution34Test {

    @Test
    void detail_employees_prints_out_all_employees(){
        ArrayList<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        String employeesInfo = solution34.detailEmployees(employees);
        assertEquals(0, employeesInfo.compareTo("There are 5 employees:\nJohn Smith\nJackie Jackson\nChris Jones\nAmanda Cullen\nJeremy Goodwin\n"));
    }
    @Test
    void detail_employees_prints_when_no_employees(){
        ArrayList<String> employees = new ArrayList<>();

        String employeesInfo = solution34.detailEmployees(employees);
        assertEquals(0, employeesInfo.compareTo("There are 0 employees:\n"));
    }
    @Test
    void remove_employees_removes_when_given_proper_name() {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        employees = solution34.removeEmployee(employees, "Chris Jones");

        ArrayList<String> actual = new ArrayList<>();
        actual.add("John Smith");
        actual.add("Jackie Jackson");
        actual.add("Amanda Cullen");
        actual.add("Jeremy Goodwin");

        assertEquals(employees.toString(), actual.toString());
    }

    @Test
    void remove_employees_does_not_affect_list_when_given_invalid_name() {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        employees = solution34.removeEmployee(employees, "Indiana Jones");

        ArrayList<String> actual = new ArrayList<>();
        actual.add("John Smith");
        actual.add("Jackie Jackson");
        actual.add("Chris Jones");
        actual.add("Amanda Cullen");
        actual.add("Jeremy Goodwin");

        assertEquals(employees.toString(), actual.toString());
    }
}