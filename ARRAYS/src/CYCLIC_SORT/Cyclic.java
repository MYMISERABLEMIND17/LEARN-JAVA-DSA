package CYCLIC_SORT;

import java.util.Arrays;
import java.util.Scanner;

public class Cyclic {
    public static void main(String[] args) {
        // when number is given from 1 to n , apply cyclic sort
        Scanner inp = new Scanner(System.in);
        System.out.print("Total elements in the array = ");
        int elem = inp.nextInt();
        int[] arr = new int[elem];
        for(int i = 0; i<= elem-1 ; i++ ){
            arr[i] = inp.nextInt();
        }
        int j = 0 ;
        while ( j<= arr.length-1 ) {
            int x = arr[j]-1 ;
            if(arr[j] == j+1){
                j++ ;
            }
            else if (arr[j] != j+1) {
                int temp = arr[j];
                arr[j] = arr[x] ;
                arr[x] = temp ;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
