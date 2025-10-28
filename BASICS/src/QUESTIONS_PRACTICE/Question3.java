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
        int[] output = new int[nums.length-1] ;
//        int previousnum = 0 ;
//        int secpreviousnum = 0 ;
        int sum  = 0 ;
        for(int j= 0 ; j<=nums.length-1; j++){
            sum = sum + nums[j] ;
            System.out.println(sum);

        }
        }

    }

