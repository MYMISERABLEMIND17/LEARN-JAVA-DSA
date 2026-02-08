package WEEKLY_CONTEST_488;

public class QUESTION1 {
    public static void main(String[] args) {
        int[] arr = {5,4,3} ;
        logic(arr);
    }
    static void logic(int[] nums ){
        int count = 0 ;
        for (int i = 0; i < nums.length-1; i++) {
            float sum = 0 ;
            for (int j = i+1; j < nums.length ; j++) {
                 sum = sum + nums[j];
            }
            int x = nums.length-i-1 ;
            if(nums[i] * (x) > sum ){
                count++ ;
            }


        }
        System.out.println(count);
    }
}
