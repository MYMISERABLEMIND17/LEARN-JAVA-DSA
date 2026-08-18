public class Problem_2540 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,6} ;
        int[] nums2 = {2,3,4,5} ;

            int i  = 0 ;
            int  j = 0  ;
            while( i < nums1.length && j < nums2.length){
                if(nums1[i] == nums2[j]){
                    System.out.println(nums1[i]);
                }

                if(nums1[i]  > nums2[j] ){
                    j++ ;
                }
                else{
                    i++ ;
                }

            }
            System.out.println("-1");
    }

}
