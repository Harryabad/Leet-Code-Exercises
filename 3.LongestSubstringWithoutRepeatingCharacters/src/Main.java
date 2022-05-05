/**
 * Given a string s, find the length of the longest substring without repeating characters.
 */

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a bunch of characters (A-Z) >> ");
        String s = sc.nextLine().toLowerCase();

        int start = 0;
        String temp = "";
        String subString = "";

        while(start < s.length()){ // traverse through whole string
            if(!temp.contains("" + s.charAt(start))){ // if the two letters do not match
                temp += s.charAt(start); // the starting character is added to the temp string
                start++; // and you loop again with a new start value (position 2,3,4 etc)

                if(temp.length() > subString.length()){
                    subString = temp;
                    // if our temp string is longer than our longest substring, the temp string becomes new longest

                }
            } else{
                temp = temp.substring(1);
                //if we detect a clash we start the process again from the new starting position, until the while
                // loop is over
            }
        }
        System.out.println("The longest run of characters without repeats: " + subString);
        System.out.println("This had a size of: " + subString.length());



    }
}