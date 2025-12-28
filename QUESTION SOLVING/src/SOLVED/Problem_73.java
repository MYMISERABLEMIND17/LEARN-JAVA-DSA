package SOLVED;

import java.util.Arrays;

public class Problem_73 {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1} ,{1,0,1} , {1,1,1}} ;
        logic(arr);
    }
    static void logic (int[][] nums ){

        System.out.println(nums.length);
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j < nums[i].length ; j++) {
                if(nums[i][j] == 0){
                    System.out.println(i +""+ j);
                    int k = 0 ;
                    while (k<nums[i].length){
                        nums[k][j] = 0 ;
                        k++ ;
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(nums));
    }
}
