/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex27;

public class inputValidation {
    public static String firstNameValidator(String name){
        if(name.length() == 1)
            return name + " is not a valid first name. It is too short. \n";
        if(name.length() == 0)
            return "The first name must be filled in.\n";
        return "";
    }
    public static String lastNameValidator(String name){
        if(name.length() == 1)
            return name + " is not a valid last name. It is too short. \n";
        if(name.length() == 0)
            return "The last name must be filled in.\n";
        return "";
    }

    public static String IDValidator(String id){

        if(id.length() != 7)
            return id + " is not a valid ID.\n";
        if(!Character.isLetter(id.charAt(0)) || !Character.isLetter(id.charAt(1)))//checks first two chars are letters.
            return id + " is not a valid ID.\n";
        if(id.charAt(2) != '-')
            return id + " is not a valid ID.\n";

        for(int ticker = 3; ticker < 7; ticker++){//checks last 4 ensuring numbers
            if(!Character.isDigit(id.charAt(ticker)))
                return id + " is not a valid ID.\n";
        }
        return "";
    }

    public static String zipValidator(String zip){
        for(int ticker = 0; ticker < zip.length(); ticker++){   //checks every char ensuring all are digits
            if(!Character.isDigit(zip.charAt(ticker)))
                return "The ZIP code must be numeric.";
        }
        return "";
    }

}
