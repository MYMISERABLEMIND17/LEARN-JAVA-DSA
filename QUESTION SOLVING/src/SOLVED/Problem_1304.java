package SOLVED;

public class Problem_1304 {
    public static void main(String[] args) {
        int n = 7  ;
        logic(n) ;
    }
    static int[] logic( int k ){
        int[] arr = new int[k];
        if(k%2 == 0 ){
            int number = k/2 ;
            for (int i = 0; i < k ; i++) {
                if (number != 0 ){
                    arr[i] =  -number;
                    number--;
                }
                else if (number ==0) {
                    number-- ;
                    i = i-1 ;
                }
            }
        }
        else {
            int number = (k-1)/2 ;
            for (int j = 0; j < k ; j++) {
                arr[j] = -number ;
                number-- ;
            }
        }
        return arr ;
    }
}
