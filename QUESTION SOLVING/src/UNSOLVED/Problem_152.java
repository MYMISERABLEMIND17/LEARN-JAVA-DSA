package UNSOLVED;

public class Problem_152 {
    public static void main(String[] args) {
        int[] arr = {-3,0,1,-2 } ;
        System.out.println(logic(arr));
    }
    static int logic(int[] nums){
        int largerprod = 1;
        for (int i = 0; i <nums.length ; i++) {
            int prod = nums[i]  ;
            for (int j = i; j < nums.length; j++) {
                prod = prod * nums[j] ;
                if(prod > largerprod ){
                    largerprod = prod ;
                } else if (prod == 0 ) {
                    continue;
                }
            }
        }
        return largerprod ;
    }
}
