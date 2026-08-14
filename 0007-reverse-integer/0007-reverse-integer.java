class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int rem = x%10;
            

            if(rev > Integer.MAX_VALUE/10 || 
            rev==Integer.MAX_VALUE && rev > 7) {
                return 0;
            }

            if(rev < Integer.MIN_VALUE/10 ||
            rev == Integer.MIN_VALUE && rev < -9) {
                return 0;
            }

            rev = rev*10 + rem;

            x = x/10;
        }
        return rev;
    }
}