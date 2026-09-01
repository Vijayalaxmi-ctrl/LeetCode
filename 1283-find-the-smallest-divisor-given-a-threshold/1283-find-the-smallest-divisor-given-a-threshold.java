class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length ; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }

        if(nums.length > threshold) {
            return -1;
        }
        
        // for(int d = 1 ; d <= max ; d++) {
        //     int sum = 0;
        //     for(int i= 0; i < nums.length ; i++) {
        //     sum += Math.ceil((double) nums[i] /  d);
        //     }
        //     if(sum <= threshold) {
        //         return d;
        //     }
        // }
        // return -1;

        int low = 1;
        int high = max;
        int ans = -1;
        
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(sumOfD(nums,mid) <= threshold) {
                ans = mid;
                high = mid-1;
            }else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int sumOfD(int[] arr, int div) {
        int sum = 0;
        for(int i = 0;i < arr.length ;i++) {
            sum += Math.ceil((double)arr[i]/div);
        }
        return sum;
    }
}