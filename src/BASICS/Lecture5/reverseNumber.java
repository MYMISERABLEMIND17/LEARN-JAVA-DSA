package BASICS.Lecture5;
import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
//        step1 =>  take the input from the user
        Scanner input = new Scanner(System.in);

        System.out.println("number you want to rearrange = ");
        int number = input.nextInt() ;

        int ans = 0 ;
        while(number >0 ){
            int remai = number %10 ;
            number = number/10 ;
            ans = ans*10 +remai ;

            }
        System.out.println(ans);
        }
    }

