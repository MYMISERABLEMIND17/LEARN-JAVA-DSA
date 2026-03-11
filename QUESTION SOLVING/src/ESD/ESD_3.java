package ESD;

import com.sun.jdi.connect.Connector;

public class ESD_3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,56,5} ;
        int target = 4 ;
        System.out.println(logic1( arr , target));
    }
    static String  logic1(int[] nums ,int  target){
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] == target ){
                return "found" ;
            }
        }
        return "notfound" ;
    }
}
