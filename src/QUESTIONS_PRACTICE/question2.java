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

        ;
        for (int j = 0; j < 1; j++) {
            System.out.print("[");
            for (int k = 0; k <= element - 1; k++) {
                int[] output = new int[(nums.length)];
                output[k] = nums[k];
                System.out.print(output[k]+",");
            }
            for (int b = 0; b <= element-1; b++) {
                int[] output = new int[(nums.length)];
                output[b] = nums[b];
                System.out.print(output[b] +",");
            }
            System.out.print("]");
            }
//        for(int a = 0 ; a<1 ; a++){
//            for (int b = 0 ; b <= element-1 ;b++ ){
//                int[] output = new int[(nums.length)] ;
//                output[b] = nums[b] ;
//                System.out.println(output[b]);
//            }
//        }
//        System.out.println();

        }
    }
