package Arrays.lect1.Array;

import java.util.Scanner;

public class UserInputArr {
    public static void main(String[] args) {
        int[] Myarr = new int[5] ;

        // taking input
        Scanner input = new Scanner(System.in) ;
//      taking input from the user
        for(int i=0 ;i<Myarr.length ;i++ ){
            Myarr[i] = input.nextInt();
        }
        // printing the array
        for(int j=0 ; j< Myarr.length ;j++){
            System.out.println("value at index" + j + " is = "+Myarr[j]);
        }
    }
}
