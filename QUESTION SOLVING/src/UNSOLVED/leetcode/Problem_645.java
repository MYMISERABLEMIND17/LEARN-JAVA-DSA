import java.util.Arrays;

public class Problem_645 {
    public static void main (String[] args ) {
        int num = 1 ;
        int a = num ;

        int mask  = 0 ;
        while (a > 0 ){
            a >>= 1 ;
            mask<<= 1 ;
            mask  =  mask | 1 ;


        }
        System.out.println(mask ^ num) ;

    }
}
