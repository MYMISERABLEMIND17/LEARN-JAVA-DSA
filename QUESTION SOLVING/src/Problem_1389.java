import java.util.Arrays;

public class Problem_1389 {
    public static void main(String[] args) {
        int[] nums ={0,1,2,3,4} ;
        int[] index = {0,1,2,2,1} ;
        logic(nums , index) ;
    }
    static void logic(int[] nums , int[] index){
        int[] output = new int[nums.length] ;

        for (int i = 0; i < nums.length-1 ; i++) {
                if(output[index[i]]==0) {
                    output[index[i]] = nums[i];
                }
                else{
                    for (int j = index[i]+1 ; j <= 0  ; j--) {
                        output[j] = output[j+1] ;
                    }
                }
        }
        System.out.println(Arrays.toString(output));
    }
}
