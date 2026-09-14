package CONTESTS;

public class question {
    public static void main(String[] args) {
        int[] nums = {8,8,8,8} ;
        int count  = 0 ;
        for(int i  = 0 ; i < nums.length ; i ++ ) {
            int first  = i ;
            int sec  = -1 ;
            int third  = -1 ;
            for(int j = i+ 1 ; j < nums.length ; j++ ){
                if(nums[i] == nums[j] ){
                    if(sec == -1 ){
                        sec = j ;
                    }
                    else{
                        third = j ;
                    }
                }

                if(third - sec  == sec - first && third - sec > 1 && sec - first >1 ) {
                    count ++ ;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
