class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // int min = nums[0];
        // for(int i = 1 ; i < nums.length ; i++) {
        //     if(nums[i] < min ) {
        //         min  = nums[i];
        //     }
        // }
        int[] res = new int[nums.length];
        int k = 0;
        for(int i = 0; i < nums.length ; i++) {
            int max = nums[i];
            for (int j = 0 ; j < nums.length ; j++) {
                if(nums[j] < max ) {
                    k++;
                }
            }
            res[i] = k;
            k = 0;
        }
        
        return res;
    }
}