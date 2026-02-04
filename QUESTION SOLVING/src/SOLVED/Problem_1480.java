package SOLVED;

import java.util.Arrays;

public class Problem_1480 {
    public static void main(String[] args) {
        int[] myarr = {1,4,6,8} ;

        System.out.println(logic(myarr));
    }
    static int[] logic(int[] arr ){
        for (int i = 1; i < arr.length-1 ; i++) {
            arr[i] = arr[i] + arr[i-1] ;
        }
        System.out.println(Arrays.toString(arr));
        return arr ;
    }
}
