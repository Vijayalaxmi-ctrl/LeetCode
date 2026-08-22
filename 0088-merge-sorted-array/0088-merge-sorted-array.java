class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] num = new int[m+n];
        int left = 0;
        int right = 0;
        int index = 0;
        while(left < m && right < n) {        
            if(nums1[left] <= nums2[right]) {    
                num[index] = nums1[left];     // 1 2 2 3 
                left++; 
                index++;
            } else {
                num[index] = nums2[right];
                index++;
                right++;
            }
        }
        while(left < m) {
            num[index] = nums1[left];
            left++;
            index++;
        }
        while(right < n) {
            num[index] = nums2[right];
            index++;
            right++;
        }

        for(int i = 0 ; i < num.length ; i++) {
            // if(i < m) {
                nums1[i] = num[i];
            // } 
            // else {
            //     nums2[i-m] = num[i];
            // }
        }
    }
}