import java.util.Arrays;

public class Problem_121 {
    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1} ;

        System.out.println(logic(arr));
    }

    static int logic(int[] prices) {
        int maxprofits = 0 ;
        for (int i = 0; i < prices.length; i++) {
            int profit = 0 ;
            for (int j = i+1; j < prices.length ; j++) {
                profit = prices[j] - prices[i] ;
                if(profit<0){
                    break ;
                } else if (profit > maxprofits) {
                    maxprofits = profit ;
                }
            }
        }
        return maxprofits ;
    }
}
