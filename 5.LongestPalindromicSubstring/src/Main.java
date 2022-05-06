import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a random string of characters >> ");
        String s = sc.nextLine();

        String longestPalindrome = "";
        int maxLengthSubstring = 0;


        for(int index = 0; index < s.length() ; index++){
            //For palindromes with an odd numbered length

            int leftIndex = index, rightIndex = index; // declare start position
            System.out.println(leftIndex + " odd left index");

            // while left between start of word, right is between end of word & both chars match
            while((leftIndex >= 0 && rightIndex < s.length() && s.charAt(leftIndex) == s.charAt(rightIndex))){

                // if longestSubstring so far is less that size gap of new indexes
                if(maxLengthSubstring < rightIndex - leftIndex +1){
                    longestPalindrome = s.substring(leftIndex, rightIndex+1); // declare new longestPalindrome
                    maxLengthSubstring = rightIndex - leftIndex +1; // set the length for new longest
                }
                // expand the two pointers either direction
                leftIndex--;
                rightIndex++;
            }
            //For palindromes with an even numbered length
            leftIndex = index;
            System.out.println(leftIndex + " even left index");
            rightIndex = index+1;
            while((leftIndex >= 0 && rightIndex < s.length() && s.charAt(leftIndex) == s.charAt(rightIndex))) {
                if (maxLengthSubstring < rightIndex - leftIndex + 1) {
                    longestPalindrome = s.substring(leftIndex, rightIndex + 1);
                    maxLengthSubstring = rightIndex - leftIndex + 1;
                }
                leftIndex--;
                rightIndex++;

            }
        }

        System.out.println(longestPalindrome);

    }
}
