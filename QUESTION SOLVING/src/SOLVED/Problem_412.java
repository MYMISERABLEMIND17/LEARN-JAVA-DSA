package SOLVED;

import java.util.ArrayList;

public class Problem_412 {
    public static void main(String[] args) {
        int n = 5 ;
        ArrayList<String> x = new ArrayList<>() ;

        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0  && i % 5  == 0 ){
                x.add("FizzBuzz") ;
            }
            else if (i % 3 == 0) {
                x.add("Fizz") ;
            }
            else if (i % 5== 0) {
                x.add("Buzz") ;
            }
            else{
                x.add(i +"") ;
            }
        }
        System.out.println(x);
    }
}
