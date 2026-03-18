package SOLVED.leetcode;

public class Problem_367 {
    public static void main(String[] args) {
        int x = 16 ;
        System.out.println(logic(x));
    }
    static boolean logic(int num){
        int i = 0 ;
        while(i<=Integer.MAX_VALUE){
            int prod = i *i ;
            if( prod == num ){
                return true ;
            }
            if (prod > num ) {
                return false ;
            }
            i++ ;
        }
        return false ;
    }
}
