class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int cnt = 0;
        int prefix = 0;
        map.put(0,1);
        for(int i = 0; i < n ; i++) {
            prefix += nums[i];

            int remove = prefix - k;

            if(map.containsKey(remove)) {
                cnt += map.get(remove);
            }
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return cnt;
    }
}