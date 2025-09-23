package BASICS.Lecture4;

import java.util.Scanner;

public class temperature {

    public static void main(String[] args) {
        Scanner input  = new Scanner( System.in) ;

        System.out.print("whats the temprature in  celcius = ");
        int cel = input.nextInt();

        int fr = cel * 9/5 +32 ;
        System.out.println("temprature in the Fahrenheit = " + fr);

    }

}
