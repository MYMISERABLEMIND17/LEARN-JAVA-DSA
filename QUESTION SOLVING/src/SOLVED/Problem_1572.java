package SOLVED;

public class Problem_1572 {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1} ,{1,1,1} ,{1,1,1},{1,1,1}};
        logic(matrix);
    }

    static void logic(int[][] nums){
        int primary = 0  ;
        int secondary = 0 ;
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j < nums[i].length; j++) {

                if( i == j ){
                    primary = nums[i][j] + primary ;
                }
                else if(i+j == nums[i].length-1){
                    secondary = nums[i][j] + secondary  ;
                }


            }
        }
//        if(nums[0].length %2 != 0 ){
//            secondary =secondary-nums[nums.length/2][nums[nums.length/2]/2]  ;
//        }
        int totalsum = primary+ secondary ;
        System.out.println(totalsum);

    }
}
