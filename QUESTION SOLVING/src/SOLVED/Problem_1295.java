package SOLVED;

public class Problem_1295 {
    public static void main(String[] args) {
        int[] arr ={555,901,482,1771} ;
        int count = 0 ;
        for (int i=0 ; i<arr.length ; i++){
            int digit = 0 ;
            int n = arr[i];
            while( n != 0   ){
                 n = n/10 ;
                 digit++ ;
            }
            if(digit%2 == 0){
                count++ ;
            }

        }
        System.out.println(count);



    }
}
