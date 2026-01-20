public class Problem_1672 {
    public static void main(String[] args) {
        int[][] arr = {{1,5},{7,3}, {3,5}} ;
        System.out.println(logic(arr));
    }
    static int logic(int[][] nums ){
        int max = 0  ;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0 ;
            for (int j = 0; j < nums[i].length; j++) {
                sum = nums[i][j] + sum ;
            }
            if(sum > max ){
                max = sum ;
            }
        }
        return max ;
    }
}
