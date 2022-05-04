/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 */

import java.util.Scanner;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        LinkedList<Integer> l3 = new LinkedList<>();

        System.out.print("Enter a number between 0 and 1000000 >> ");
        int num1 = Integer.valueOf(sc.nextLine());
        while(num1 > 0){
            l1.add(num1 % 10);
            num1 = num1 / 10;
        }

        System.out.print("Enter a second number between 0 and 1000000 >> ");
        int num2 = Integer.valueOf(sc.nextLine());
        while(num2 > 0){
            l2.add(num2 % 10);
            num2 = num2 / 10;
        }

        //System.out.println(l1);
        reverseLinkedList(l1);
        //System.out.println(l1 + "\n");
        int x = linkedListToNumber(l1);


        //System.out.println(l2);
        reverseLinkedList(l2);
        //System.out.println(l2 + "\n");
        int y = linkedListToNumber(l2);

        int sum = x + y;

        while (sum > 0){
            l3.add(sum %10);
            sum = sum /10;
        }
        reverseLinkedList(l3);
        System.out.println("Sum: " + l3);

    }


    /**
     * The for loop below works by traversing the list a first time and swaps the 1st and nth element
     * Then a second swapping the 2nd and (n-1)th elements  and so on.
     */
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> ll){

        for (int i = 0; i< ll.size() / 2; i++){
            int temp = ll.get(i);
            ll.set(i, ll.get(ll.size() - i - 1));
            ll.set(ll.size() - i - 1, temp);
        }
        return ll;
    }

    public static int linkedListToNumber(LinkedList<Integer> ll){
        String num = "";

        for(int i = 0; i < ll.size(); i++){
            num += ll.get(i).toString();

        }
        return Integer.valueOf(num);
    }

}