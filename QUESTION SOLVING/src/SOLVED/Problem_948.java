package SOLVED;

import java.util.Arrays;

public class Problem_948 {
    public static void main(String[] args){
        int[] tokens ={200 , 100} ;
        int power = 150 ;

        logic(tokens , power) ;

    }
    static void logic(int[] tok , int pow ){
        Arrays.sort(tok) ;
        int count = 0 ;
        int i = 0 ;
        int j = tok.length -1 ;

        while(i <= j ){
            if(pow >= tok[i]){
                if(count >= 0 ){
                    count++ ;
                }
                pow = pow - tok[i] ;
                i++ ;

            }
            else if(pow < tok[i] & count > 0){
                    count-- ;

                pow = pow + tok[j] ;
                j-- ;
            }
        }
        System.out.println(count) ;
    }
}
