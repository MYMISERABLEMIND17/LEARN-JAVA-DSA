package UNSOLVED;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_268_UNSOLVED {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in );
        System.out.print("ENTER THE TOTAL NUMBERS = ");
        int elem = inp.nextInt() ;
        int[] myarr = new int[elem];

        input(myarr ,elem );
        swaplogic(myarr);

    }
    static void input(int[] arr , int elem ) {
        Scanner inp = new Scanner(System.in);
        for (int i = 0; i <= elem - 1; i++) {
            arr[i] = inp.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swaplogic(int[] arr) {
        // first sort the array
        int i = 0;
        while (i <= arr.length - 1) {
            if (arr[i] == i) {
                i++;
            } else if (arr[i] != i) {
                // swap
                int temp = arr[i];
                arr[i] = i;
                i = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }





}
