package BUBBLE_SORT;

import java.util.Arrays;
import java.util.Scanner;

public class Input_bubble {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Total elements in the array = ");
        int target = inp.nextInt();
        int[] arr = new int[target];
        for(int i= 0 ; i<=target-1 ; i++ ){
            arr[i] = inp.nextInt();
        }

        System.out.println(Arrays.toString(arr));


        int[] ans = bubble(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] bubble(int[] Myarr){
        for(int a= 0 ; a<Myarr.length-1 ; a++ ){
            for(int b=1 ; b<=Myarr.length-a-1; b++  ){
                if(Myarr[b] < Myarr[b-1]){
                    //swap
                    int temp = 0 ;
                    temp = Myarr[b] ;
                    Myarr[b] = Myarr[b-1] ;
                    Myarr[b-1] = temp ;

                }
            }
        }
        return Myarr;
    }

}
