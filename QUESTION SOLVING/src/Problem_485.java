public class Problem_485 {
    public static void main(String[] args) {

        int[] nums = {1, 1, 0, 1,1,1,1,1};

        System.out.println(logic(nums));

    }

    static int logic(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count1++ ;
                if (count2 < count1) {
                    count2 = count1 ;
                }

            }
            else{
                count1 = 0 ;
            }
        }
        return count2;
    }
}