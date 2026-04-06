package UNSOLVED.leetcode;

public class Problem_43 {
    public static void main(String[] args) {
        String num1 = "123456789" ;
        String num2 = "987654321" ;
        logic(num1 , num2);
    }
    static void logic(String num1 ,String num2 ){
        long numm1 = Integer.parseInt(num1) ;
        long numm2 = Integer.parseInt(num2) ;
        long ans = numm1 * numm2 ;
        System.out.println(ans);
        String x  = String.valueOf(ans) ;

    }
}
