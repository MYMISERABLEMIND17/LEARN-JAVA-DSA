public class Problem_121 {
    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1} ;

        logic(arr);
    }

    static int logic(int[] arr) {

        int lowprice = arr[0] ;
        int profit = 0 ;
        for (int i = 0; i < arr.length ; i++) {
            int highprice = arr[i] ;
            int calc = highprice - lowprice ;
            if(highprice< lowprice ){
                lowprice = arr[i] ;
            }
            else if(profit < calc){
                    profit = calc ;
                }

        }
        return profit ;

    }
}
