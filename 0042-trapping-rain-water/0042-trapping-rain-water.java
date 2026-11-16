class Solution {
    public int trap(int[] height) {
        int[] leftMax = prefixSum(height);
        int[] rightMax = suffixSum(height);
        int total = 0;
        for(int i = 0; i < height.length ; i++) {
            if(leftMax[i] > height[i] && rightMax[i] > height[i]) {
                total += Math.min(leftMax[i],rightMax[i]) - height[i];
            }
        }
        return total;
    }

    public int[] prefixSum(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i< arr.length ; i++) {
            prefix[i] = Math.max(arr[i],prefix[i-1]);
        }
        return prefix;
    }

    public int[] suffixSum(int[] arr) {
        int[] suffix = new int[arr.length];
        suffix[arr.length -1]= arr[arr.length - 1];
        for(int i = arr.length - 2 ;i >= 0 ; i--) {
            suffix[i] = Math.max(arr[i],suffix[i+1]);
        }
        return suffix;
    }
}