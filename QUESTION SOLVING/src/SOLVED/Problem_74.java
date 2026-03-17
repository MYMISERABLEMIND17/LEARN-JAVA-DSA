package SOLVED;

public class Problem_74 {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}} ;
        int target = 3  ;
        System.out.println(logic(matrix , target));

    }
    static boolean logic(int[][]nums , int target  ){
        int temp = -1  ;
        for (int i = 0; i < nums.length; i++) {
            if(target >= nums[i][0] && target<= nums[i][nums[i].length-1]){
                temp = i ;
            }
        }
        if(temp == -1 )return false ;

        int j = 0 ;
        while ( j < nums[temp].length){
            if(nums[temp][j] == target ){
                return true ;
            }
            j++ ;
        }



//        for (int i = 0; i < 3; i++) {
//            System.out.println(Arrays.toString(nums[i]));
//        }

        return false ;
    }
}
