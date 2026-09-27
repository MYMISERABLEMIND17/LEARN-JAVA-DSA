package SOLVED;

public class Problem_1493 {
    public static void main(String[] args) {
        int[] nums = {1,1,1} ;

        // find the first one  ;
        int start = 0;

        for(int i = 0 ; i < nums.length ; i++ ){
            if(nums[i] == 1 ) {
                start = i;
                break ;
            }
        }
        System.out.println(start);
        int maxones=  0 ;
        int zeroindex = 0 ;
        int zerocount = 0 ;
        int onescount = 0 ;
        int left = start ;
        int right = start;
        while (right < nums.length){

            if(nums[right] == 1 ){
                onescount++ ;
                right++ ;

            } else if (nums[right] == 0 && zerocount == 0 ) {
                zerocount++ ;
                zeroindex = right ;
                right++ ;
            }
            else if(nums[right] == 0  && zerocount ==1 ){
                while(left <= zeroindex ){
                    if(nums[left] == 1 ){
                        onescount-- ;
                    }
                    else if(nums[left] == 0){
                        zerocount-- ;
                    }
                    left++ ;
                }
            }
            maxones = Math.max(maxones ,onescount) ;

        }
        System.out.println(maxones);
        if(maxones == nums.length){
            System.out.println(nums.length-1);
        }
        else if(maxones == 0 ){
            System.out.println(0);
        }
        System.out.println(maxones);


    }
}
