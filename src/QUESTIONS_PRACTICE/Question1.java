package QUESTIONS_PRACTICE;
//Approach =>
/*
1>> take the input from the user, how many elements you want in an array
2>> create array with user inputs and then create a normal from 0 to user elements count
3>> user input array se value lo , usko index mai change karo or fir , us index ki value ki valuee wapis user array mai check karke de do wapis



*/

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
//        Step1 = execution
        Scanner inp = new Scanner(System.in) ;
        System.out.print("HOW MANY ELEMENT YOU WANT IN ARRAY = ");
        int element = inp.nextInt(); // total no of elements by user
        int[] myArr = new int[element];
//        int[] newArr = new int[element] ;

        for(int i = 0 ; i<element ; i++){
            myArr[i] = inp.nextInt() ;
        }
        for(int j = 0 ; j<myArr.length; j++){
            int[] optArr = new int[myArr.length] ;
            System.out.println(j);
        }


        System.out.println(Arrays.toString(myArr));
//        System.out.println(Arrays.toString(newArr));






    }
}
