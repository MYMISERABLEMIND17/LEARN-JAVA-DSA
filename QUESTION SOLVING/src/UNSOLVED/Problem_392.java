package UNSOLVED;

import java.util.Arrays;

public class Problem_392 {
    public static void main(String[] args) {
        String s = "axc" ;
        String t = "ahbgdc" ;

        System.out.println(logic(s , t ));
    }
    static boolean logic(String s, String t){
        int[] arr = new int[s.length()] ;
        int i = 0;
        int j =0 ;
        while( i < t.length() ){
            if( s.charAt(j) == t.charAt(i) ){
                arr[j] = i ;
                i = 0 ;
                j++ ;
            }
            if(j == s.length()){
                break;
            }
            i++ ;
        }
        System.out.println(Arrays.toString(arr));
        for (int k = 0; k < arr.length -1 ; k++) {
            if(arr[i] > arr[i+1] ){
                return false ;
            }
        }
        return true ;
    }
}
