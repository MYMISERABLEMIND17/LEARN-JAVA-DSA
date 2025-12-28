package SOLVED;

import java.util.Arrays;

public class Problem_3074 {
    public static void main(String[] args) {
        int[] apples = {9,8,8,2,3,1,6} ;
        int[] boxes = {10,1,4,10,8,5} ;

        System.out.println(logic(apples , boxes));
    }
    static int  logic( int[] apple , int[] capacity){
        // sort the capacity

        for (int i = 0; i <capacity.length ; i++) {
            int min = i ;
            for (int j = i+1 ; j <capacity.length ; j++) {
                if(capacity[j] > capacity[min]){
                    min = j ;
                }
            }
            //swap
            int temp = capacity[i] ;
            capacity[i] = capacity[min] ;
            capacity[min] = temp ;
        }
        System.out.println(Arrays.toString(capacity));
        // now find the total apple

        int total= 0 ;
        int h = 0 ;
        while( h < apple.length){
            total = total + apple[h] ;
            h++ ;
        }
        System.out.println(total);

        // on more loop in which we will compare capacity with total , create a count variable
        int sum = 0 ;
        int  count = 0 ;
        int t= 0 ;
        while(sum <= total && t < capacity.length ){
            sum = sum + capacity[t];
            count ++ ;
            t++ ;
            if(sum ==total){
                break ;
            }
        }
        
        return count ;

    }
}
