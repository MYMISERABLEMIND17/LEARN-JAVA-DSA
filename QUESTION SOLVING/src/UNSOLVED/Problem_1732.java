package UNSOLVED;

public class Problem_1732 {
    public static void main(String[] args) {
        int[] gain = {2,1,1,2} ;

        System.out.println(logic(gain));
    }
    static int logic( int[] nums){
        int altitude = -100 ;
        int temp = 0 ;
        for (int i = 0; i < nums.length; i++) {
            temp = temp + nums[i] ;
            if(temp > altitude ){
                altitude = temp ;
            }
        }
        return altitude ;
    }
}
