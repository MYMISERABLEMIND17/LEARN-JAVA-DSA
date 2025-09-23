package BASICS.Lecture4;

import java.util.Scanner;

public class input {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in) ;
//        String name = input.toString();
//        int score = input.nextInt();//ignore , try something but fail
//        System.out.println(name) ;
//        System.out.println(score) ;//ignore , try something but fail
//        System.out.println(name+ " = "+ score ); //ignore , try something but fail

        Scanner input  =  new Scanner(System.in);

        System.out.print("enter your marks = ");
        int score = input.nextInt();
        System.out.println("your marks = " + score);



    }
}