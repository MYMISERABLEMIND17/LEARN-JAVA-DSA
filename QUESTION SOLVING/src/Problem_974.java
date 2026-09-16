import java.util.Arrays;
    public class Problem_974 {
        public static void main(String[] args) {
                int[] nums = {4,5,0,-2,-3,1} ;  int k = 5 ;
                int[] pref = new int[nums.length] ;

                int sum = 0 ;
                for (int i = 0 ; i < nums.length ; i++ ){
                    sum = sum + nums[i] ;
                    pref[i] = sum ;
                }

                System.out.println(Arrays.toString(pref));



        }


    }

