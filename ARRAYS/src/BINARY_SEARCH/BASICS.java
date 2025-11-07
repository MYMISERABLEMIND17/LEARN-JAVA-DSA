package BINARY_SEARCH;

import java.util.Scanner;

public class BASICS {
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,22,44,55,99,120,140,170,200} ;
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter the Target = ");
        int target = input.nextInt() ;

        System.out.println(Binary(arr , target));
    }

    public static String Binary(int Myarr[] , int Mytarget){
        int steps = 0 ;
        int low = 0 ;
        int high = Myarr.length-1 ;
        while(low<=high){
            int mid = (low + high) / 2 ;
            if(Mytarget == Myarr[mid]){
                System.out.println("total no of steps = " + steps);
                return ("value found " + Mytarget +" at "+ mid);

            }
            else if (Mytarget >= Myarr[mid]) {
                low = mid +1 ;
            }
            else if (Mytarget <= Myarr[mid]){
                high = mid -1 ;
            }
            steps = steps +1 ;
        }//while loop
        System.out.println("total no of steps taken = " + steps);
        return ("val not found ");
    };


}
