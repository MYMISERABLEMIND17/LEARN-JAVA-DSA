package SOLVED;

import java.util.Arrays;

public class Problem_2149 {
    public static void main(String[]  args){
        int[] a = { 3,-2,1,-5,2,-4} ;
        int[] pos = new int[a.length/2] ;
        int[] neg = new int[a.length/2]  ;
        System.out.println(Arrays.toString(a) ) ;
        int p = 0 ;
        int n = 0 ;
        for(int i = 0 ; i < a.length ;  i++ ){
            if(a[i] <0 ){
                neg[n] = a[i] ;
                n++ ;
            }
            else if(a[i] > 0 ){
                pos[p] = a[i] ;
                p++ ;
            }
        }
        System.out.println(Arrays.toString(pos) ) ;
        System.out.println(Arrays.toString(neg) ) ;
        p = 0 ;
        n = 0 ;
        for(int j = 0 ; j < a.length ; j++) {
            if(j % 2 == 0 ){
                a[j] = pos[p] ;
                p++ ;
            }
            else{
                a[j] = neg[n] ;
                n++ ;
            }
        }
    }
}
