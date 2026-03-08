package wEEKLY492;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {9,7,1,5,2} ;
        int size = 4 ;
        System.out.println(logic(arr , size));
    }
    static int logic(int[] nums , int target ){
        int min = 101 ;
        int index =  100;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] >= target && nums[i] < min) {
                index = i  ;
                min = nums[i] ;
            }
        }
        if(index!= 100){
            return index ;
        }
        else{
            return -1 ;
        }


    }

}
