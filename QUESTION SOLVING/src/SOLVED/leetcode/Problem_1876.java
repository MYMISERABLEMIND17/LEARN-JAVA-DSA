package SOLVED.leetcode;

public class Problem_1876 {
    public static void main (String [] args){
        String s = "abc" ;
        logic (s) ;

    }
    static void logic(String sb ){
        StringBuilder str = new StringBuilder(sb) ;
        int count  = 0  ;
        int i = 0 ;
        int j = i+1 ;
        int k = i+2 ;
        while(k <= str.length()-1){


            if(str.charAt(i) != str.charAt(j) && str.charAt(j) != str.charAt(k) && str.charAt(k) != str.charAt(i)){
                count++ ;
            }
            i++ ;
            j = i+1 ;
            k = i+2 ;
        }
        System.out.println(count) ;
    }
}
