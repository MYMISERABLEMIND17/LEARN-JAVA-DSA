package lect1.multidimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int[][] myArr = new int[2][3] ;

        int[][] myArr2d = {
                {1,45,5},
                {3,5,8}
        };

//      System.out.println(myArr2d.length);//==> this will give me the total number of rows
        System.out.println(myArr2d[1].length);
        for(int row = 0; row < myArr2d.length ; row++){
            for(int col = 0 ; col < myArr2d[row].length ; col++ ){
                myArr2d[row][col] = input.nextInt() ;
            }
        }
                // OUTPUT
//        System.out.println(myArr2d[1].length);
//        for(int row = 0; row < myArr2d.length ; row++){
//            for(int col = 0 ; col < myArr2d[row].length ; col++ ){
////                System.out.print(myArr2d[row][col] + " ");
//
//            }
//            System.out.println(Arrays.toString(myArr2d[row])); // more efficient output
//        }



        // more efficient way to output
        for(int[] arr: myArr2d){
            System.out.print(Arrays.toString(arr)+",");
        }


    }
}
