class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int cnt1 = 0;
        int ele1= Integer.MIN_VALUE;
        int cnt2 = 0;
        int ele2 = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length ; i++) {
            if(cnt1 == 0 && nums[i] != ele2) {
                cnt1++;
                ele1 = nums[i];
            }
            else if(cnt2 == 0 && nums[i] != ele1) {
                cnt2++;
                ele2 = nums[i];
            }
            else if(nums[i] == ele1) {
                cnt1++;
            }else if(nums[i] == ele2) {
                cnt2++;
            }
            else {
                cnt1--;
                cnt2--;
            }
        }
        int cn1 = 0;
        int cn2= 0;
        for(int i = 0; i < nums.length ; i++) {
            if(nums[i] == ele1) {
                cn1++;
            }
            else if(nums[i] == ele2) {
                cn2++;
            }
        }
        if(cn1 > nums.length /3) {
            res.add(ele1);
        }
        if(cn2 > nums.length / 3) {
            res.add(ele2);
        }
        
        return res;
    }
}