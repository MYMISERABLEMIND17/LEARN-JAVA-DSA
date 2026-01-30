public class Problem_1346 {
    public static void main(String[] args) {
        int[] arr =  {1,1,2,4,7};
        logic(arr);
    }
    static void logic(int[] nums){
        boolean note = false ;
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j < nums.length ; j++) {
                if(nums[j] == 2*nums[i] && i != j ) {
                    note = true ;
                }
            }
        }
        System.out.print(note);
    }
}
