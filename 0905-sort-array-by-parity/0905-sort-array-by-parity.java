class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int even  = 0  ; 

        int i =  0  ; 
        while(i < nums.length && even < nums.length){
            if(nums[i] % 2 == 0 ){
                int temp = nums[even] ; 
                nums[even] = nums[i] ; 
                nums[i] = temp ;
                even++ ;  
            }
            
                i++ ; 
            
        }
        return nums ; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna