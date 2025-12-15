package SELECTION_SORT;

import java.util.Arrays;

        public class Selection {
            public static void main(String[] args) {
                int[] myarr = {1,5,-3,2,4} ;
                selection(myarr);

            }

            static void selection(int[] arr){
                int end = arr.length-1 ;
                for(int i= 0; i<= arr.length-1 ; i++){
                     end = arr.length-1-i ;



                    // find max element
                    int max = 0 ;
                    for(int j = 1 ;j <= end ; j++){
                        if(arr[j] >  arr[max] ){
                            max = j;
                        }
                    }

                    // swap

                    int temp = arr[max] ;
                    arr[max] = arr[end];
                    arr[end] = temp ;



                }
                System.out.println(Arrays.toString(arr));


            }








        }


