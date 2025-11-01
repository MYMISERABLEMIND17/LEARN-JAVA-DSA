package LINEAR_SEARCH;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        // take input array from user

        Scanner inp = new Scanner(System.in) ;
        System.out.print("how many elements you want in array = ");
        int element = inp.nextInt() ;

        int[] MyArr = new int[element] ;
        for (int k = 0; k < element; k++) {
            MyArr[k] = inp.nextInt();
        }
        System.out.println(Arrays.toString(MyArr));

        System.out.print("initial index = ");
        int i = inp.nextInt();
        System.out.print("final index = ");
        int j = inp.nextInt();
        System.out.print("target value = ");
        int target = inp.nextInt();




        loop(MyArr, i ,j, target);
    }



    public static String loop (int Arr[] , int start , int end, int val ) {
        if (Arr.length == 0) {
            return "array not found ";
        }

        while (start <= end) {
            if (val == Arr[start]) {
                System.out.println("value found at " + start + " index");
            }
            start++;
        }
        return "search complete " ;
    }
}
