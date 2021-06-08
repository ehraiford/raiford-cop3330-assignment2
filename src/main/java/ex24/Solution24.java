package ex24;

import java.util.Scanner;

public class Solution24 {

    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       AnagramDetector ad = new AnagramDetector();

       String string1 = createString(in, "Enter the first string:");
       String string2 = createString(in, "Enter the second string:");

       boolean result = ad.isAnagram(string1, string2);

       String answer = generateOutput(result);
       System.out.println("\"" + string1 + "\" and \"" + string2 + "\" " + answer);
    }

    public static String generateOutput(boolean isAnagram){
        String output;
        if(isAnagram) {
            output = " are anagrams.";
        }else {
            output = " are not anagrams.";
        }
        return output;
    }

    public static String createString(Scanner in, String prompt){
        System.out.println(prompt);
        String string = in.next();
        return string;
    }
}
