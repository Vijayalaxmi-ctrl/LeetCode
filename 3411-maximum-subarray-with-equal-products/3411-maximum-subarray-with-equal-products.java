class Solution {
    public int maxLength(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length ; i++) {
            long prod = 1;
            long hcf = nums[i];
            long lcm = nums[i];
            for(int j = i ; j < nums.length ; j++) {
                prod *= nums[j];
                hcf = gcd(hcf,nums[j]);
                lcm = (lcm * nums[j]) / gcd(lcm,nums[j]);
                if(prod == hcf * lcm) {
                    max = Math.max(max,j - i + 1);
                }
            }
        }
        return max;
    }

    public long gcd(long a,long b) {
        while(b!= 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}