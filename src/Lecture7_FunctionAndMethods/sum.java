package Lecture7_FunctionAndMethods;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        sumnum();
    }

    static void sumnum(){
        Scanner input = new Scanner(System.in) ;
        System.out.print(" first num => ");
        int a = input.nextInt();
        System.out.print(" second num => ");
        int b = input.nextInt() ;
        int sum = a +b ;
        System.out.println(sum);
    }

}
