class Solution {
    public int subtractProductAndSum(int n) {
        int result = 0;
        int product = 1;
        int sum = 0;
        while(n>0) {
            int rem = n % 10;
            product *= rem;
            sum += rem;
            n = n/10;
        }
        result = product - sum;
        return result;
    }
}