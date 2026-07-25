class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        int sum = 0;
        // int i = 0;
        // while(i < accounts.length)
        for(int i = 0 ; i < accounts.length ; i++) {
            for(int j = 0 ; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if(sum > wealth) {
                wealth = sum;
            }
            sum = 0;
        }
        return wealth;
    }
}