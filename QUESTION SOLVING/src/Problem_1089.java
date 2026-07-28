import java.util.Arrays;

public class Problem_1089 {
    public static void main (String[] args) {
        int[] arr = {1,0,4,3,0,4,7,0} ;
        int j = arr.length-1 ;
        int i = 0 ;
        while(i < arr.length){
            if(arr[i] == 0){
                while(j > i ){
                    arr[j] = arr[j-1] ;
                    j--;
                }

                arr[i+1] = 0 ;
                i = i+1;
            }
            j = arr.length-1 ;
            i++ ;
        }
        System.out.println(Arrays.toString(arr)) ;

    }
}
