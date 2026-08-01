class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
            int sum = 0;
            for(int j = 0 ; j < nums.length ; j++) {
                sum += nums[j];


                if(sum > max) {
                    max = sum;
                }

                if(sum < 0) {
                    sum = 0;
                }
            }
        
        return max;
    }
}