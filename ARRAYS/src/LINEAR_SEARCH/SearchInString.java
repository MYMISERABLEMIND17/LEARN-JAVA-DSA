package LINEAR_SEARCH;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {

        // take input from the user
        Scanner inp = new Scanner(System.in) ;
        System.out.print("enter the string = ");
        String type = inp.next() ;
        System.out.print("which character do you want to find = ");
        char target = inp.next().charAt(0) ;

        for (int j = 0; j <type.length()-1 ; j++) {
            if(target == type.charAt(j)){
                System.out.println("character found at index " + j);
            }
            else{
                System.out.println("val not found ");
            }
        }
    }
}