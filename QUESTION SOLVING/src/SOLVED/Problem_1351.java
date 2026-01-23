package SOLVED;

public class Problem_1351 {
    public static void main(String[] args) {
        int[][] array = {{4,3,2,-1} , {3,2,1,-1} , {1,1,-1,-2} , {-1,-1,-2,-3}} ;

//        System.out.println(logic(array));
    }
    static int  logic (int[][] nums){
        int count = 0 ;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length ; j++) {
                if(nums[i][j] < 0  ){
                    count++ ;
                }
            }

        }
        return count ;
    }
}
