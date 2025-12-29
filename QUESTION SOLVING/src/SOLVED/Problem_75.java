package SOLVED;

import java.util.Arrays;

public class Problem_75 {
    public static void main(String[] args) {
        int[] arr = {2,2,0,0,2,1,1,0,2,1};
        logic(arr);
    }
    static void logic(int[] arr ){
        int count0 = 0 ;
        int count1 = 0 ;
        int count2 = 0 ;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == 0 ){
                count0++ ;
            }
            else if (arr[i] == 1){
                count1++ ;
            } else if (arr[i] == 2 ) {
                count2++ ;
            }
        }
        for (int j = 0; j < arr.length ; j++) {
            if(j <count0){
                arr[j] = 0 ;
            } else if (j<(count0+count1)) {
                arr[j] = 1 ;
            } else if (j<(count0+count1+count2)) {
                arr[j] = 2 ;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count0 +""+ count1 +""+ count2 );
    }
}
