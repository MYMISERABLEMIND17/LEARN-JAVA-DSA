package SOLVED.leetcode;

import java.util.Arrays;

public class Problem_14 {
    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"} ;
        logic(strs) ;
    }
    static String  logic(String[] str ){
        // compare first and last ;

        Arrays.sort(str);
        String first  = str[0] ;
        String last = str[str.length-1] ;

        StringBuilder common = new StringBuilder() ;

        int i =0 ;
        while( i< first.length() && i< last.length()){
            if(first.charAt(i) == last.charAt(i)){
                common.append(last.charAt(i)) ;
            }
            else{
                break ;
            }
            i++ ;
        }
        System.out.println(common);
        String result = common.toString() ;
        return result ;
    }
}
