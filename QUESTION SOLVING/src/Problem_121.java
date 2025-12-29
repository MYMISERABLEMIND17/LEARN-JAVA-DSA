import java.util.Arrays;

public class Problem_121 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4} ;

        System.out.println(logic(arr));
    }

    static int logic(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            int min = i ;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j] < arr[min]){
                    min = j ;
                }
            }
            int temp = arr[min] ;
            arr[min] = arr[i] ;
            arr[i] = temp ;
        }


        int maxprofit = arr[arr.length-1] - arr[0] ;
        if(maxprofit > 0 ){
            return maxprofit ;
        }
        return 0 ;
    }
}
