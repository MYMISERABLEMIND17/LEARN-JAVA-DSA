class Solution {
    public int minPairSum(int[] nums) {
        
        Arrays.sort(nums) ; 
        int end  = nums.length-1 ; 
        int max = 0 ; 
        for(int i  = 0 ; i < nums.length/2  ;i ++ ){
            if(nums[i] + nums[end-i] > max){
                max = nums[i] + nums[end-i] ; 
            }
        }
        return max ; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna