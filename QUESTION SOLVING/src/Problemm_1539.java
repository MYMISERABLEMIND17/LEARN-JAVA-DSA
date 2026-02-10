    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;

    public class Problemm_1539 {
        public static void main(String[] args) {
            int[] arr = {1};
            int n = 996;
            logic(arr, n );
        }
        static void logic(int[] nums , int k) {
            ArrayList<Integer> list = new ArrayList<Integer>(k+nums.length+1);
            int i = 1;
            int count = 0 ;
            int j = 0 ;
            while(i<= k+nums.length+1 && count<=k){

                if(i != nums[j] && count<=k){
                    list.add(i);
                    count++;
                }
                else if(j<nums.length-1){
                   j++ ;
                }
                i++;
            }
            System.out.println(list);
            System.out.println(list.get(k-1));
        }
    }
