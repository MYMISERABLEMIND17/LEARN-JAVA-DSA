package SOLVED.leetcode;

public class Problem_2839 {
    public static void main(String[] args) {
        String s1 = "abcd" ;
        String s2 = "cdab" ;
        logic(s1 , s2);
    }
    static void logic(String s11, String s22){
        StringBuilder s1 = new StringBuilder(s11) ;
        StringBuilder s2 = new StringBuilder(s22) ;
        int i = 0 ;
        int j = i+2 ;
        while(j < s1.length()){
            j = i+2 ;

            if(s1.charAt(i) != s2.charAt(i) && s2.charAt(i) == s1.charAt(j)){
                char temp = s1.charAt(j) ;

            }

            i++ ;
        }
    }
}
