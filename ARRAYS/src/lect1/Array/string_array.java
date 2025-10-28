package lect1.Array;

import java.util.Arrays;

public class string_array {
    public static void main(String[] args) {


        String[] x = new String[6] ;
        x[1] = "tom";
        x[2] = "sarth" ;
        for(String val : x){
            System.out.println(Arrays.toString(x));
        }
    }
}
