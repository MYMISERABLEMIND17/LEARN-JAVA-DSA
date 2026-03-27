package SOLVED;

import java.util.Arrays;

public class Problem_3110 {
    public static void main(String[] args) {
        String s = "hello" ;
        logic(s);

    }
    static void logic(String str){
        int[] arr = new int[str.length()] ;
        int  i = 0 ;
        while( i < str.length()){
            char c  = str.charAt(i) ;
            int ascii = c ;
            arr[i] = ascii ;
            i++ ;
        }
        System.out.println(Arrays.toString(arr));

        int total = 0 ;
        int j = 0 ;
        while ( j < arr.length-1 ){
            int calc = arr[j] - arr[j+1];
            if( calc < 0 ){
                calc = calc * (-1   ) ;
            }
            total = total + calc ;
            j++;
        }
        System.out.println(total);
    }
}
