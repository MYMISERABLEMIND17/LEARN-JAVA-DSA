package SOLVED;

public class Problem_1855 {
    static void main(String[] args) {
        int[] n1 = {55,30,5,4,2} ;
        int[] n2 = {100,20,10,10,5} ;
        int max = 0 ;
        for(int i = 0 ; i < n1.length ; i ++ ){

            int start = i ;
            int end  = n2.length-1 ;
            while(start <= end ) {
                int mid = start + (end - start) /2 ;
                if(n2[mid] >= n1[i] ){
                    max = Math.max(mid - i  ,  max) ;
                    start = mid +1 ;
                }
                else{
                    end = mid -1 ;
                }
            }
         ;
        }
        System.out.println(max);


    }
}
