class Solution {
    public int trap(int[] height) {
        int total = 0;
        int[] leftMax = leftMax(height);
        int[] rightMax = rightMax(height);
        for(int i = 0; i < height.length ; i++) {
            if(height[i] < leftMax[i] && height[i] < rightMax[i]) {
                total += Math.min(leftMax[i],rightMax[i]) -height[i];
            }
        }
        return total;
    }
    public int[] leftMax(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i < arr.length;i++) {
            prefix[i] = Math.max(prefix[i-1],arr[i]);
        }
        return prefix;
    }

    public int[] rightMax(int[] arr) {
        int[] suffix = new int[arr.length];
        suffix[arr.length-1] = arr[arr.length-1];
        for(int i = arr.length - 2;i >=0;i--) {
            suffix[i] = Math.max(suffix[i+1],arr[i]);
        }
        return suffix;
    }
}