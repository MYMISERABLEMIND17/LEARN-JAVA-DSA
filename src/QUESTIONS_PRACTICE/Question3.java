package QUESTIONS_PRACTICE;

import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in) ;
        System.out.print("input = ");
        int elements = inp.nextInt() ;
        int[] nums = new int[elements] ;

        for(int i = 0 ; i<=nums.length-1 ; i++){
            nums[i] = inp.nextInt();
        }
// input complete
        int x ;
        int y ;
        for (int j = 0 ; j<nums.length ;j++ ){
            x = nums[j] ;
            System.out.println(x);

        }



        }

    }

