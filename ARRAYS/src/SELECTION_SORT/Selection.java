package SELECTION_SORT;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] myarr = {4,8,6,2,7,1,5} ;

        // find the maximum element

        int min = myarr[0] ;
        int x = 0;

        for(int j = 0 ; j<= myarr.length-1; j++){
            for (int i = j ; i<= myarr.length-1; i++ ){
                if( min > myarr[i]){
                    min = myarr[i];
                }

            }
            for (int k = j; k <= myarr.length-1 ; k++) {
                if(min > myarr[k] ){
//                    swap
                    min = x ;
                    x = myarr[k] ;
                    myarr[k] = min ;

                }
            }
        }



    }
}
