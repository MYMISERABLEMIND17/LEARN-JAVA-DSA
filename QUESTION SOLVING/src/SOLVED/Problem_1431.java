package SOLVED;

public class Problem_1431 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3} ;
        int extra = 3 ;
        logic(arr , extra) ;
    }
    static boolean[] logic(int[] nums , int extra ){
        int max = nums[0] ;
        boolean[] arr = new boolean[nums.length] ;
        for (int i = 0; i <nums.length ; i++) {
            if(max < nums[i] ){
                max = nums[i] ;
            }
        }
        System.out.println(max);


        for (int i = 0; i < nums.length; i++) {
            if( nums[i] + extra >= max ){
                arr[i]  = true ;
            }

        }


        return arr ;
    }
}
