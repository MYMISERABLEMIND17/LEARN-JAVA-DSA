package BUBBLE_SORT;

import java.util.Arrays;

public class SORT_CODE {
    public static void main(String[] args) {
        int[] arr = {1,5,3,7,9,6} ;
        System.out.println(Arrays.toString(bubble(arr)));
    }

    public static int[] bubble(int[] Myarr ){

        for(int i= 0 ; i<Myarr.length; i++){
            for(int j = 1 ; j<Myarr.length-i;j++){

                if (Myarr[j]< Myarr[j-1]){
                    //swap
                    int temp = Myarr[j] ;
                    Myarr[j] = Myarr[j-1] ;
                    Myarr[j-1] = temp ;

                }
            }
        }

        return Myarr;
    }

}
