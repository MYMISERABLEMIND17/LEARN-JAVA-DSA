import java.util.Arrays;

public class Problem_628 {
    public static void main(String[] args) {
        int[] nums = {4,6,2,1,3} ;
        product(nums);
    }
    static void product(int[] nums){
        int[] arr = new int[nums.length] ;

        if(nums.length<3){
            return ;
        }
        else{
            for (int i = 0; i < nums.length ; i++) {
                 arr[i]=nums[i];
            }
            System.out.println(Arrays.toString(arr));
            //time to sort the arr

        }


    }
}
