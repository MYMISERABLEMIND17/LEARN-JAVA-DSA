import java.util.Arrays;

public class selection {
    public static void main(String[] args) {

        int[] arr = { 5,2,5,8,90,2,1};

        for(int i =0 ; i<= arr.length-1 ; i++){
            int wtswap = i ;

            for(int j = i ; j<= arr.length-1 ; j++ ){

                if(arr[j] < arr[wtswap]){
                    wtswap = j ;
                }

            }

            int temp = arr[wtswap] ;
            arr[wtswap] = arr[i] ;
            arr[i] = temp ;
        }

        System.out.println(Arrays.toString(arr));
    }
}
