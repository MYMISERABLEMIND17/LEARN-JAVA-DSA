import java.lang.reflect.Array;
import java.util.ArrayList;

public class Problem_1539 {
    public static void main(String[] args) {
        int[]  arr = {2,3,4,7,11} ;
        int k = 5 ;
        logic(arr , k );
    }
    static int  logic(int[] nums , int k ){
        ArrayList<Integer> x = new ArrayList<>() ;
        int count  = 0 ;
        int i = 1 ;
        int pointer = 0 ;
        while(k > count){

            if(nums[pointer] == i  && pointer < nums.length){
                if(pointer == nums.length-1){
                    i++ ;
                }
                else{
                    i++ ;
                    pointer++ ;
                }

            }
            else{
                x.add(i) ;
                i++ ;
                count++ ;
            }
        }
        return x.get(k-1);
    }
}
