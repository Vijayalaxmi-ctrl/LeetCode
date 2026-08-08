class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> list = new LinkedHashSet<>();
        int k = 0;
        for(int i = 0; i < nums.length ; i++) {
            if(!list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }

        for(int num:list) {
            nums[k] = num;
            k++;
        
        }
        return k;
    }
}