/** TWO SUM
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> inputNumbers = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();

        while (true) {

            System.out.print("Enter a number (Press 00 to exit) >> ");

            int x = sc.nextInt();

            if (x == 00) {
                break;
            } else {
                inputNumbers.add(x);
            }
        }
        System.out.print("\n Enter a target number >> ");
        int target = sc.nextInt();

        System.out.println(inputNumbers);
        System.out.println("Target = " + target);


        /** Code below explained: Brute Force [Nested for loop]
         *  We are traversing though the arraylist of numbers inputted by the user.
         *  And for each value we come across we are traversing the same list a second time adding values
         *  i + j to see it they equal the target.  If they do, they are added to a new array as a pair.
         *
         *  Time Complexity: O(n^2)
         */

        for (int i = 0; i < inputNumbers.size() -1; i++){ // outer loop from i = 0 to i = n-2
            for(int j = i+1; j < inputNumbers.size(); j++){ // inner loop from j = i+1 to j = n-1
                System.out.println("i position: " + i + ", i value: " + inputNumbers.get(i) +
                        " || j position " + j + ", j value: " + inputNumbers.get(j));
                if(inputNumbers.get(i) + inputNumbers.get(j) == target){
                    nums.add(inputNumbers.get(i));
                    nums.add(inputNumbers.get(j));
                }
            }
        }

        //


        System.out.println("\n Pairs: " +nums);

    }
}