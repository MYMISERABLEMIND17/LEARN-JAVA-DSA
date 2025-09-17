package Lecture5;

import java.util.Scanner;

public class numOcc {
    public static void main(String[] args) {
//        STEP 1=> INPT FROM THE USER
        Scanner input = new Scanner(System.in) ;
        System.out.print("enter the number = ");
        int number = input.nextInt() ;
//        step 2=> take a input , which repetation do you want
        System.out.print("WHICH NUMBER REPETATION DO YOU WANT = ");
        int rep = input.nextInt( );
        int count = 0 ;
//        for (int i=0 ; i<= count ; i++ ){
//            count++ ;
//        }

        while (number>0){
            if (number%10 == rep ){
                count++;
            }
            number = number/10 ;
        }

        System.out.println("total reps = "+  count);

    }
}
