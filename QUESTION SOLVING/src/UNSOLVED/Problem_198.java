package UNSOLVED;

public class Problem_198 {
    public static void main(String[] args) {
        int[] houses ={2,7,3,1,9} ;
        System.out.println(logic(houses));
    }
    static int logic(int[] nums){
        int first = 0 ;
        int second = 0 ;
        int random = 0 ;

        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+2; j < nums.length; j++) {
                if(nums[i] + nums[j] > random){
                    random = nums[i]+nums[j];
                }
            }
            if(i%2 == 0 ){
                first = first + nums[i] ;
            }
            else {
                second = second + nums[i] ;
            }
        }
        if(first>second && first>random){
            return first ;
        } else if (second>first && second>random) {
            return second ;
        }
        return random  ;

    }
}
