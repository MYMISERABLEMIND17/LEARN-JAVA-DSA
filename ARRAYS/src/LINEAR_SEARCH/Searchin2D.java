package LINEAR_SEARCH;

import java.util.Arrays;
import java.util.Scanner;

public class Searchin2D {
    public static void main(String[] args) {
        int Myarr[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {15,5,2,8}
        } ;

        // take target from user
        Scanner input = new Scanner(System.in);
        System.out.print("enter the target = ");
        int target = input.nextInt() ;


        int[] ans = search(Myarr , target) ;
        System.out.println(Arrays.toString(ans)) ;
    }

    static int[] search(int[][] arr , int target){
        for (int row = 0;row<arr.length; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col]== target){
                    return new int[] {row ,col} ;
                }

            }
        }
        return new int[] {-1 , -1};
    }

}
