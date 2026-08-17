class Solution {
    public void sortColors(int[] nums) {
        int mid = 0;
        int low = 0;
        int high = nums.length - 1;

        while(high >= mid) {
            if(nums[mid] == 0) {
                swap(nums,mid,low);
                low++;
                mid++;
            }else if(nums[mid] == 1) {
                mid++;
            }else {
                swap(nums,mid, high);
                    high--;
            }
        }
        }
        void swap(int[] arr, int a, int b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }
