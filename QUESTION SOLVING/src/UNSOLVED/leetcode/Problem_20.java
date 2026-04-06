package UNSOLVED.leetcode;

public class Problem_20 {
    public static void main(String[] args) {
        String s = "([])" ;

        System.out.println(logic(s));
    }
    static boolean logic(String str){
        int i = 0 ;
        int q = 0 ;
        int c = 0 ;
        int sq = 0 ;

        while( i < str.length()){
            if(str.charAt(i) == '('){
                q++ ;
            }
            else if(str.charAt(i) == ')' ){
                q-- ;
            }
            else if(str.charAt(i) == '['){
                sq++ ;
            }else if(str.charAt(i) == ']'){
                sq-- ;
            }else if(str.charAt(i) == '{'){
                c++ ;
            }else if(str.charAt(i) == '}'){
                c-- ;
            }


            i++ ;
        }
        if(q == 0 && sq == 0 && c == 0 ){
            return true ;
        }
        return false ;
    }
}
