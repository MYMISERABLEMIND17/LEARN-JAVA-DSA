package UNSOLVED;

public class Problem_1380 {
    public static void main(String[] args) {
        int[][] arr = {{1,10,4,2} , {9,3,8,7} , {15,16,17,12}} ;
        logic(arr) ;
    }
    static void logic(int[][] nums ){

        for (int i = 0; i < nums.length ; i++) {
            int maxcol = nums[0][i] ;
            int minrow = nums[i][0] ;
            for (int j = 0; j <nums[i].length ; j++) {
                if(nums[i][j] < minrow) {
                    minrow = nums[i][j] ;
                }
            }
//            System.out.println(minrow);

            for (int k = 0; k < nums[i].length ; k++) {
                if(nums[k][i] > maxcol) {
                    maxcol = nums[k][i];
                }
            }
            System.out.println(maxcol);
        }
    }
}
