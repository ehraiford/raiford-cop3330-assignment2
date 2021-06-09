/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex25;
//only provides proper validation for the four types of passwords provided by exercise.
//password outside of those constraints eg under 8 characters but containing special character
//are considered very weak.
public class PasswordValidator {
    public int strength(String password){
        int result = 0;

        boolean hasAlph = checkAlph(password);
        boolean hasDigit = checkDigit(password);

        if(password.length() < 8){//turns result to 1 if it under 8 chars and has letters and no numbers
           if(hasDigit == false && hasAlph == true)
                result = 1;
        }else {
            boolean hasSpecial = checkSpecial(password);//result = 2 if rules for strong are met. 3 for very strong requirements.
            if (hasDigit == true && hasAlph == true && hasSpecial == false) {
                result = 2;
            } else if (hasDigit == true && hasAlph == true && hasSpecial == true)
                result = 3;
        }
        return result;
    }

    public boolean checkAlph(String password){//returns true if string contains letter
        for(int i = 0; i < password.length(); i++){
            if(Character.isLetter(password.charAt(i)) == true)
                return true;
        }
        return false;
    }
    public boolean checkDigit(String password){//returns true if string contains number
        for(int i = 0; i < password.length(); i++){
            if(Character.isDigit(password.charAt(i)) == true)
                return true;
        }
        return false;
    }
    public boolean checkSpecial(String password){//returns true if string contains special character
        for(int i = 0; i < password.length(); i++){
            if(Character.isDigit(password.charAt(i)) == false && Character.isLetter(password.charAt(i)) == false)
                return true;
        }
        return false;
    }
}
