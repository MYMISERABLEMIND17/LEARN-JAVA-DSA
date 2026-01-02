package UNSOLVED;

public class Problem_53 {
    public static void main(String[] args) {
        int[]  nums = {-2,1,-3,4,-1,2,1,-5,4} ;
        logic(nums);
    }
    static void logic(int[] arr){

        int finalsum  = 0 ;
        for(int i = 0 ; i< arr.length ; i++ ){
            int sum = 0 ;
            for (int j = i; j < arr.length ; j++) {
                sum = sum + arr[j] ;

            }
            if(sum > finalsum){
                finalsum = sum ;
            }
        }
        System.out.println(finalsum);
    }
}
