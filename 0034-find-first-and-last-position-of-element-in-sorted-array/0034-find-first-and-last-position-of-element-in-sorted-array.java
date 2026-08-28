class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstOcc(nums,target);
        if (first == nums.length || nums[first] != target) {
            return new int[] {-1,-1};
        }
        return new int[] {first,secondOcc(nums,target)-1};
    }

    public int firstOcc(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(arr[mid] >= target) {
                ans = mid;
               
                high = mid - 1;
            }
            else {
                 low = mid + 1;
            }
        }
        return ans;
    }
     
    public int secondOcc(int[] arr,int target) {
        int low = 0; 
        int high = arr.length -1;
        int ans = arr.length;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(arr[mid] > target) {
                ans = mid ;
                high = mid - 1;
            } else {
            low = mid +1;
        }}
        return ans;
        }
        
    }
