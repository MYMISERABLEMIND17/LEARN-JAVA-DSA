package QUESTIONS_PRACTICE;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("HOW MANY ELEMENTS DO YOU WANT = ");
        int element = inp.nextInt();
        int[] nums = new int[element];

        for (int i = 0; i <= element - 1; i++) {
            nums[i] = inp.nextInt();
        }

        int[] ans = new int[nums.length];
        int mid = nums.length/2  ;
        for(int j = 0 ; j<= nums.length-1 ;j++){
            if(j<=mid-1){
                for(int k = 0 ; k<=nums.length-1 ; k++){
                    ans[k] = nums[k] ;
                } ;
            }
            else{
                for(int k = 0 ; k<=nums.length-1 ; k++){
                    ans[mid+k] = nums[k] ;
                }
            }
            System.out.println(Arrays.toString(ans));
        }


        }
    }
