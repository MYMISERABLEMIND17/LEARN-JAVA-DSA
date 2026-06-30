public class Problem_1011 {
    public static void main(String[]args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10} ;
        int days = 5  ;

        System.out.println(logic(arr , days));
    }
    static int  logic (int[] nums , int days){
        //  a loop to find max
        //  a loop to find the max weight ,
        int max = -1 ;
        int sum = 0 ;
        for (int i = 0; i < nums.length; i++) {
            if(max < nums[i]) {
                max = nums[i];
            }
            sum = sum + nums[i] ;
        }
        int start = max ;
        int end = sum ;
        int mid = start + (end - start)/2 ;
        int count = 0 ;
        while(start <= end ){
            int cap  = 0 ;
            count = 1;
            mid = start + (end - start)/2 ;
            int i = 0 ;
            while (i < nums.length){
                cap = cap + nums[i] ;
                if( cap <= mid){
                    i++ ;
                }
                else if (cap > mid ) {
                    count++ ;
                    cap = nums[i];
                    i++ ;
                }
            }

            if(count <= days ){
                end = mid -1 ;
            }
            else {
                start = mid +1 ;
            }
            System.out.println(mid );
        }
        return start;

    }
}
