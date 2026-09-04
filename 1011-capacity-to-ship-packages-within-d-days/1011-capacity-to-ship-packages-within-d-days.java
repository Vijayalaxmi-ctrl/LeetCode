class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i< weights.length ; i++) {
            sum += weights[i];
            if(weights[i] > max) {
                max = weights[i];
            }
        }
       int low = max;
       int high = sum;
       int ans = -1;
       while(low <= high) {
        int mid = low + (high - low) /2;
        int daysreq = dayReq(weights,mid);
        if(daysreq > days) {
            
            low = mid + 1;
        }else {
            ans = mid;
            high = mid - 1;

        }
       }
       return ans;
    }

    public int dayReq(int[] arr, int cap) {
        int days = 1;
        int load =0;
        for(int i = 0; i < arr.length ; i++) {
            if(load + arr[i] > cap) {
                days += 1;
                load = arr[i];
            }
            else {
                load+= arr[i];
            }
        }
        return days;
    }
}