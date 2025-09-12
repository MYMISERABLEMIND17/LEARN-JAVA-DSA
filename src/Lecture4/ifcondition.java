package Lecture4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ifcondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt() ;


        if( x == 10 ){
            System.out.println("hello world ");
        }
        else{
            System.out.println("the number is not 10 ");
        }
    }
}
