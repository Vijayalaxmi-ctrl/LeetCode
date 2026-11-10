class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nge = new int[nums1.length];
        for(int i = 0 ; i < nums1.length;i++) {
            int index = -1;
            for(int j= 0;j < nums2.length;j++) {
                if(nums2[j] == nums1[i]) {
                    index = j;
                    break;
                }
            }
            nge[i] = -1;
            for(int j = index+1; j<nums2.length;j++) {
                if(nums2[j] > nums1[i]) {
                    nge[i] = nums2[j];
                    break;
                }
            }
        }
        return nge;
    }
}