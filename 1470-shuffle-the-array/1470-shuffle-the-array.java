class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int i = 1;
        int j = n;
        int k =0;
        while(k< nums.length) {
            res[k] = nums[i-1];
            k++;
            res[k] = nums[j];
            k++;
            i++;
            j++;
        }
        return res;

    }
}