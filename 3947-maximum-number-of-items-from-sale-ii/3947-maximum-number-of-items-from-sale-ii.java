// class Solution {
//     public int maximumSaleItems(int[][] items, int budget) {
        
//     }
// }

class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int[] freq = new int[n+1];
        int cheapest = Integer.MAX_VALUE;

        for(int[] item : items) {
            freq[item[0]]++;
            cheapest = Math.min(cheapest, item[1]);
        }

        for(int factor = 1 ; factor <= n ; factor++) {
            for(int multiple = factor * 2; multiple <= n ; multiple += factor) {
                freq[factor] += freq[multiple];
            }
        }

        Arrays.sort(items,(a,b) -> Integer.compare(a[1],b[1]));

        int ans = 0;

        for(int[] item : items) {
            int factor = item[0];
            int price  = item[1];

            if((long) price >= 2L * cheapest) {
                break;
            }

            int freeCnt = freq[factor] - 1;

            if(freeCnt <= 0) {
                continue;
            }

            int take = Math.min(freeCnt,budget/price);

            ans += take * 2;
            budget -= take * price;
        }

        ans += budget / cheapest;

        return ans;

    }
}
