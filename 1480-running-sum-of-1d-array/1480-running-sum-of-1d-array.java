class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int i = 0;
        int res = 0;
        while(i<nums.length) {
            for(int j =0; j<=i;j++) {
                res += nums[j];
            }
            result[i] = res;
            res=0;
            i++;
        }
        return result;
    }
}