import java.util.Arrays;

public class Problem_2594 {
    public static void main(String[] args) {
        int[] ranks = {4,2,3,1} ;
        int cars = 10 ;
        int minval= Integer.MAX_VALUE ;
        for (int i = 0; i < ranks.length; i++) {
            if(ranks[i] < minval){
                minval = ranks[i];
            }
        }
        System.out.println(minval);

        int trmax = minval * cars * cars ;
        int trmin = 1 ;


        System.out.println(trmax);
    }

}
