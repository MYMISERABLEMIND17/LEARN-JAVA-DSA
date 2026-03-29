package SOLVED.leetcode;

public class Problem_3884 {
    public static void main(String[] args) {
        String s  = "abcacbd" ;
        logic(s) ; ;
    }
    static void logic(String str){
        int j = str.length()-1 ;
        for (int i = 0; i < str.length()/2 ; i++) {
            j = str.length()-1-i ;
            if(str.charAt(i) == str.charAt(j)){
                System.out.println(i);
            }
        }
    }
}
