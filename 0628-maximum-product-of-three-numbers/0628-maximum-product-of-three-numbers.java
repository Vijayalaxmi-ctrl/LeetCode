class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int prod = 1;
        for(int i = nums.length - 1 ; i > nums.length - 4 ; i--) {
            prod *= nums[i];
        }
        int prod2 = nums[0] * nums[1] * nums[nums.length - 1];

        return Math.max(prod, prod2);
        // return prod;
        
    }
}