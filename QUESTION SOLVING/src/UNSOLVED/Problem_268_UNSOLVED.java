package UNSOLVED;

public class Problem_268_UNSOLVED {
    public static void main(String[] args) {
        int[] arr = {0,1} ;

        System.out.println(logic(arr));
    }
    static int  logic(int[] nums) {
        int x = 0 ;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j < nums.length ; j++) {
                if(i == nums[j]){
                    break;
                }
                else if (i != nums[j]) {
                    x = i ;
                }

            }
        }
        return x  ;
    }
}