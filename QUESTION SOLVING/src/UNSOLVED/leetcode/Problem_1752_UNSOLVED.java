package UNSOLVED.leetcode;

public class Problem_1752_UNSOLVED {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        logic(arr) ;
    }

    static boolean logic(int[] arr) {
        int count = 0 ;
        for (int i = 0; i <= arr.length; i++) {
            if( i == arr.length){
                i = 0 ;
            }
            if( arr[i] < arr[i+1] ){
                continue;
            }
            else count++ ;
        }



        return false ;
    }
}
