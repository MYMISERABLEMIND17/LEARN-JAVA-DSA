import java.util.ArrayList;

public class Problem_229 {
    public static void main(String[] args) {
        int[] x = {4,4,4,4,4} ;
        logic(x);
    }
    static void logic(int[] nums ){
        // my logic is count and then put them -1 ,
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 1 ;
            if(nums[i] == Integer.MIN_VALUE){
                continue;
            }
            else {
                for (int j = i+1; j < nums.length; j++) {
                    if(nums[j] == Integer.MIN_VALUE){
                        continue;
                    }
                    if(nums[i] == nums[j] ){
                        count++ ;
                        nums[j] = Integer.MIN_VALUE;
                    }

                }
            }
            if(count > (nums.length/3)){
                list.add(nums[i]) ;
                break ;
            }
        }
        System.out.println(list);
    }
}
