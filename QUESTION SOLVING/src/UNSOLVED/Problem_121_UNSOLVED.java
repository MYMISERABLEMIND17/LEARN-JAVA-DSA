package UNSOLVED;

public class Problem_121_UNSOLVED {
    public static void main(String[] args) {
        int[] arr = {2,4,1} ;

        System.out.print(logic(arr));
    }

    static int logic(int[] arr) {
        int min  = arr[0] ;
        int max = arr[0]  ;
        int maxindex = 0 ;
        for (int i = 0; i < arr.length ; i++) {
            if (max<arr[i]) {
                max = arr[i] ;
                maxindex = i ;
            }
            if(min > arr[i]  && i < maxindex){
                min = arr[i] ;
            }
        }
        int profit = max -min ;
        return  profit ;
    }
}
