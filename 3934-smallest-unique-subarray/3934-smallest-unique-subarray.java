class Solution {
    static final long MOD1 = 1_000_000_007L;
    static final long MOD2 = 1_000_000_009L;
    static final long BASE = 131;

    public int smallestUniqueSubarray(int[] nums) {
        int n = nums.length;

        long[] prefix1 = new long[n + 1];
        long[] prefix2 = new long[n + 1];

        long[] power1 = new long[n + 1];
        long[] power2 = new long[n + 1];

        power1[0] = 1;
        power2[0] = 1;

        for(int i = 0; i < n; i++) {
            prefix1[i + 1] = (prefix1[i] * BASE + nums[i]) % MOD1;
            prefix2[i + 1] = (prefix2[i] * BASE + nums[i]) % MOD2;

            power1[i + 1] = (power1[i] * BASE) % MOD1;
            power2[i + 1] = (power2[i] * BASE) % MOD2;
        }

        int left = 1;
        int right = n;
        int answer = n;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(hashUnique(mid,n,prefix1,prefix2,power1,power2)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }

    private boolean hashUnique(
        int len,
        int n,
        long[] prefix1,
        long[] prefix2,
        long[] power1,
        long[] power2
    )  {
        HashMap<Long,Integer> map = new HashMap<>();

        for(int i = 0; i + len <= n ; i++) {
            int j = i + len;

            long h1 = (prefix1[j] - prefix1[i] * power1[len] % MOD1 + MOD1) % MOD1;
            long h2 = (prefix2[j] - prefix2[i] * power2[len] % MOD2 + MOD2) % MOD2;

            long key = (h1 << 32) | h2;

            map.put(key,map.getOrDefault(key,0) + 1);
        }
        
        for(int cnt : map.values()) {
            if(cnt == 1) {
                return true;
            }
        }
        return false;
    }
}