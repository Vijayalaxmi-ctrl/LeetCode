class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        if(bloomDay.length < (long) m*k) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < bloomDay.length ; i++) {
            if(bloomDay[i] < min) {
                min = bloomDay[i];
            }
            if(bloomDay[i] > max) {
                max = bloomDay[i];
            }
        }

        int low = min;
        int high = max;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) /2;
            boolean pos = possible(bloomDay, mid,m,k);
            if(pos) {
                ans = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public boolean possible(int[] arr, int day , int m , int k) {
        int cnt = 0;
        long noOfBouque = 0;
        for(int i = 0; i < arr.length;i++) {
            if(arr[i] <= day) {
                cnt++;
            }else {
                noOfBouque += (cnt/k);
                cnt= 0;
            }
        }
        noOfBouque += (cnt / k);
        if (noOfBouque >= m) {
            return true;
        } else {
            return false;
        }
    }
}