package ex25;

import java.util.Scanner;

public class Solution25 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String password = createPassword(in);

        PasswordValidator check = new PasswordValidator();
        int strength = check.strength(password);

        String out = "The password '" + password + "' ";
        out = out + createString(strength);

        System.out.println(out);
    }

    //uses strength to generate string strength
    private static String createString(int strength) {
        if (strength == 1)
            return "is a weak password.";
        else if(strength == 2)
            return "is a strong password.";
        else if(strength == 3)
            return "is a very strong password.";
        else
            return "is a very weak password.";
    }

    private static String createPassword(Scanner in) {
        System.out.println("Please enter your password.");
        return in.nextLine();
    }
}
