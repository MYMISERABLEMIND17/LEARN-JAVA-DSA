package SOLVED.leetcode;

public class Problem_11 {
    public static void main(String[] args) {
        int[] arr = {1,1} ;
        logic(arr);
    }
    static void logic(int[] height) {
        int width = height.length ;
        int start  = 0 ;
        int end  = height.length-1 ;
        int maxarea  = -1 ;
        while(start < end ) {
            int heightmin = 0 ;

            if(height[start] > height[end]){
                heightmin = height[end] ;
                end -- ;
                width-- ;
            }
            else {
                heightmin = height[start] ;
                start++ ;
                width-- ;
            }
            int area  = width * heightmin  ;
            if(area > maxarea){
                maxarea = area ;
            }
        }
        System.out.println(maxarea);



    }
}
