class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< piles.length ; i++) {
            if(piles[i]>max) {
                max = piles[i];
            }
        }
        // for(int i = 1 ; i <= max ; i++) {
        //     long reqTime = totalHr(piles,i);
        //     if(reqTime <= h) {
        //         return i;
        //     }
        // }
        // return -1;

        int low = 1;
        int high = max;
        int ans  = Integer.MAX_VALUE;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            long reqTime = totalHr(piles,mid);
            if(reqTime <= h) {
                ans = mid;
                high = mid-1;
            }else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public long totalHr(int[] arr, int hour) {
        long totalhr = 0;
       
        for(int i = 0 ; i < arr.length; i++){
            totalhr += (int) Math.ceil((double)arr[i]/hour);
        }
        return totalhr;
    }
}