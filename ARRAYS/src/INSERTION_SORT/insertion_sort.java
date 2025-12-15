package INSERTION_SORT;

import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int[] myarr = {5,2,4,1,3 ,-7,3} ;
        insertion(myarr);
    }

    static void insertion( int[] arr ){
        // the loop of  i will go to  the first element to the last element
        for( int i = 0 ; i<= arr.length-2 ; i++){
            for( int j = i+1  ; j>0 ; j--) {
                if(arr[j] < arr[j-1]){
                    // swap
                    int temp = arr[j-1] ;
                    arr[j-1] = arr[j] ;
                    arr[j] = temp ;
                }

                else if (arr[j] >=arr[j-1] ) {
                    break;
                }

            }
        }
        System.out.println(Arrays.toString(arr));

    }

}
