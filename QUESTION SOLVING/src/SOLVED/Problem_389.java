package SOLVED;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.toLowerCase;

public class Problem_389 {
    public static void main(String[] args ){
        String s = "abcd" ;
        String t = "abcde" ;
        logic(s , t ) ;
    }
    static void logic(String f ,String s  ){
        String n = s+f ;
        StringBuilder x = new StringBuilder(n) ;
        char a  = ' ' ;
        for(int i = 0 ; i < x.length() ; i++ ){
//            System.out.println(x.charAt(i)) ;
            a = (char) (a ^ x.charAt(i));
        }
        char g = (char) (a+ 32) ;
        System.out.println(g ) ;
    }
}
