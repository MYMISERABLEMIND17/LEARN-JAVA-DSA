package Arrays.lect1;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in) ;
//        System.out.println("total number of arrays element :");
//        int i = inp.nextInt();

        int[] arr = new int[6] ;
        arr[0] = 10 ;
        arr[1] = 20 ;
        arr[2] = 30 ;
        arr[3] = 40 ;
        arr[4] = 50 ;
        arr[5] = 60 ;


//         for(int j=0 ; j<arr.length ; j++ ){
//            System.out.println(arr[j]);
//        }
// for each
        for(int num : arr){
                 System.out.println(num);
        }


    }
}
