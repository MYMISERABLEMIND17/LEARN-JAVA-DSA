package SOLVED;

public class Problem_1487 {
    public static void main(String[] args) {
        int[] myarr = {1,4,6,8} ;
        logic(myarr)  ;
    }
    static int[] logic(int[] arr ){
        for (int i = 1; i < arr.length-1 ; i++) {
            arr[i] = arr[i] + arr[i-1] ;
        }
        return arr ;
    }
}
