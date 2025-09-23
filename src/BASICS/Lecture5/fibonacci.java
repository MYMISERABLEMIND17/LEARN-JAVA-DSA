package BASICS.Lecture5;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in );
        int user=  inp.nextInt() ;

        int a = 0 ;
        int b = 1 ;
        int count = 2 ;

        while (count <= user ){
            int temp = b ;
            b = b + a ;
            a = temp ;
            count++ ;
        }

        System.out.println( b );
    }
}
