package SOLVED;

import java.util.Arrays;

public class Problem_1052 {
    static void main(String[] args) {
        int[] c = {1,0,1,2,1,1,7,5} ;
        int[] g = {0,1,0,1,0,1,0,1} ;
        int minutes = 3 ;
        int normalsum = 0 ;
        int[] risk = new int[g.length] ;

        for (int i = 0; i < g.length; i++) {
            if(g[i] == 1 ){
                risk[i] = c[i]  ;
            }
            else{
                normalsum = normalsum + c[i] ;
            }
        }
        System.out.println(Arrays.toString(risk ));

        // now we have the window len 3  ;

        int start = 0 ;
        int end  = minutes-1 ;
        int maxsum  = 0 ;
        int sum = 0 ;

        for (int i = start; i <= end; i++) {
            sum = sum + risk[i] ;
            if(sum > maxsum){
                maxsum = Math.max(sum , maxsum) ;
            }
        }
        System.out.println(maxsum);
        System.out.println(Arrays.toString(risk));

        while (end < risk.length-1){
            sum = sum - risk[start] ;
            start++ ;
            end++ ;
            sum = sum + risk[end] ;

            if(sum > maxsum){
                maxsum = Math.max(sum , maxsum) ;
            }
        }

        System.out.println(maxsum + normalsum);


    }
}
