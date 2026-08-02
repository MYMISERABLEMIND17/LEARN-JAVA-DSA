import java.util.ArrayList;

public class Problem_442 {
    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1} ;
        ArrayList<Integer> arr= new ArrayList<Integer>() ;
        int[] number = new int[nums.length] ;


        for(int i = 0  ; i < nums.length ; i++ ){
            int ind = nums[i] ;
            if(number[ind-1] == 0 ){
                number[ind-1] = nums[i] ;
            }
            else{
                arr.add(nums[i]) ;
            }
        }
        System.out.println(arr) ;

    }
}
