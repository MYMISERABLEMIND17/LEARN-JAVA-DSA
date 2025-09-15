package Lecture5;

import java.util.Scanner;

public class CaseCheck {

    public static void main(String[] args) {
        //take the character input from the user

        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);

        if( ch >= 'a' && ch <= 'z'){
            System.out.println(" lower case ");
        }
        else{
            System.out.println(" uppercase ");
        }





    }
}
