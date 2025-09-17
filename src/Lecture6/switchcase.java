package Lecture6;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        // its just the basic , nothig more important


        // 1,2,3 , assign the week name to them
        Scanner input= new Scanner(System.in);
        System.out.print("week number from 1-7 => " );
        int num = input.nextInt() ;

        switch (num){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wed");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday ");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
        }




    }
}
