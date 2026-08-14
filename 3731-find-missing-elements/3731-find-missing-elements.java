class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> hash = new HashSet<>();
        int sm = Integer.MAX_VALUE;
        int lar = Integer.MIN_VALUE;
        
        for(int i = 0; i < nums.length ; i++) {
            hash.add(nums[i]);
            if(nums[i] > lar) {
                lar = nums[i];
            }
            if(nums[i] < sm) {
                sm = nums[i];
            }
        }
        for(int i = sm; i <= lar ; i++) {
            if(!hash.contains(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
}