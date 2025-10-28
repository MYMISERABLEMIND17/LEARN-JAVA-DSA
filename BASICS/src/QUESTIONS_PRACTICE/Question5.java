package QUESTIONS_PRACTICE;

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in) ;
        System.out.print("total no if elements = ");
        int n = inp.nextInt();

        int[] nums = new int[n];
        for(int i =0 ; i<= nums.length-1 ; i++ ){
            nums[i] = inp.nextInt() ;
        }
        // input complete
        int mid ;
        mid =  (0 +nums.length)/2;
        int[] x = new int[mid] ;
        int[] y = new int[mid] ;

        // for x
        for(int j = 0 ; j<=mid-1 ; j++ ){
            x[j] = nums[j] ;
        }
        System.out.println(Arrays.toString(x));
//        for y
        for(int k = 0  ; k<=mid-1; k++ ){
                y[k] = nums[mid+k];
        }
        System.out.println(Arrays.toString(y));


//        int[] output = new int[nums.length-1];
//        for(int p = 0 ; p<=mid-1 ; p++){
//            output[p] =
//        }




    }

}
