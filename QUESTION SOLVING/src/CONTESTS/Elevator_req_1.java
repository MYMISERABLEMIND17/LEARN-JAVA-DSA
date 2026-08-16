package CONTESTS;

public class Elevator_req_1 {
    public static void main(String[] args) {
        int n = 5 ;
        int[] nums = {2,0,0} ;
        int from  = 0 ;
        int time = 0 ;
        int too = 0  ;
        int sum = 0 ;

        for(int i  = 0  ; i < nums.length ; i++ ) {
            too = nums[i];
            sum = from - too;
            if (sum < 0) {
                time = time + (-1 * sum);
            } else {
                time = time + sum;
            }
            from = too;

        }
        System.out.println(time);
    }
}
