package SOLVED;

public class Problem_2419 {
    public static void main(String[] args) {
        int[] arr = {-1 , 1 } ;

        logic(arr);
    }
    static int[] logic(int[] arr){
        int[] positive = new int[arr.length/2] ;
        int[] negative = new int[arr.length/2] ;
        int i = 0 ;
        int neg = 0 ;
        int  pos = 0 ;
        while(i != arr.length){
            if(arr[i] < 0 ){
                negative[neg] = arr[i] ;
                neg ++ ;
            } else if (arr[i] > 0  ) {
                positive[pos] = arr[i] ;
                pos ++ ;
            }
            i++ ;
        }

        int neg2 = 0 ;
        int  pos2 = 0 ;
        int[] ans = new int[arr.length] ;
        for(int i2 = 0  ; i2 < arr.length ; i2++){
            if(i2 %  2 == 0 ) {
                ans[i2] = positive[pos2];
                pos2++;
            }
            else {
                ans[i2] = negative[neg2] ;
                neg2++ ;
            }
        }
        return ans ;

    }
}
