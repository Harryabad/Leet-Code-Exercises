/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        ArrayList<Integer> array3 = new ArrayList<>();

        while (true){
            System.out.print("Enter numbers to populate the first arrayList (00 will close the list) >> ");
            int x = Integer.valueOf(sc.nextLine());
            if(x == 00){
                break;
            } else{
                array1.add(x);
            }
        }
        System.out.println();


        while (true){
            System.out.print("Enter numbers to populate the second arrayList (00 will close the list) >> ");
            int y = Integer.valueOf(sc.nextLine());
            if(y == 00){
                break;
            } else{
                array2.add(y);
            }
        }

        System.out.println("\nArray1: " + array1);
        System.out.println("Array2: " + array2);

        array3.addAll(array1);
        array3.addAll(array2);

        System.out.println("\nTogether: " + array3);

        selectionSort(array3);

        System.out.println("\nTogether (Sorted): " + array3);

        double median = median(array3);

        System.out.println("The median of this array is: " + median);





    }

    public static void selectionSort(ArrayList<Integer> arr){

        int length = arr.size();

        for(int i=0; i<length-1 ; i++){

            int minimumIndex = i;
            for(int j=i; j < arr.size(); j++){
                if(arr.get(j) < arr.get(minimumIndex)){
                    minimumIndex = j;
                }
            }
            int temp = arr.get(minimumIndex);
            arr.set(minimumIndex,  arr.get(i));
            arr.set(i, temp);

        }
    }

    public static double median(ArrayList<Integer> arr){

        if(arr.size() %2 == 1){
            double median = (double)arr.get(arr.size()/2);
            return median;

        } else{
            int sumOfMid = ((arr.get(arr.size()/2)) + (arr.get(arr.size()/2 -1)));
            double median = ((double)sumOfMid)/2;
            return median;

        }

    }
}