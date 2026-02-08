import java.util.Arrays;

public class Problem_832 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 0},{1, 0, 1},{0, 0, 0}, {1,0,1}};
        logic(matrix);
    }

    static void logic( int[][] nums ){

        for (int i = 0; i < nums.length; i++) {

            for (int k = 0; k < nums.length/2 ; k++) {
                int temp = nums[i][k] ;
                nums[i][k] =  nums[i][nums[i].length-k-1] ;
                nums[i][nums[i].length-k-1] = temp ;
            }

            for (int j = 0; j < nums[i].length ; j++) {
                if(nums[i][j] == 0 ){
                    nums[i][j] = 1 ;
                } else if (nums[i][j] == 1) {
                        nums[i][j] = 0 ;
                }
            }
        }
        System.out.println(Arrays.deepToString(nums));
    }
}
