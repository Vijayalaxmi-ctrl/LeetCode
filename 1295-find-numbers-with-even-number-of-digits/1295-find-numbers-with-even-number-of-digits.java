class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            int dig = nums[i];
            int c = 0;
            while(dig!=0) {
                int rem = dig%10;
                c++;
                dig = dig/10;
            }
            if(c % 2==0) {
                count++;  //1
            }
            
        }
        return count;
    }
}