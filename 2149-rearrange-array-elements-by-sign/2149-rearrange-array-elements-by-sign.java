class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        int[] pos = new int[nums.length /2];
        int[] neg = new int[nums.length/2];
        int k  = 0 ;
        int l = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] > 0) {
                pos[k] = nums[i];
                k++;
            }else {
                neg[l] = nums[i];
                l++;
            }
        }
        for(int i = 0 ; i < nums.length /2 ; i++) {
           res[2*i] = pos[i];
           res[2*i+1] = neg[i];
        }
        return res;
    }
}