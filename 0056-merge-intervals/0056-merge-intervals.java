class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals ,(a,b) -> a[0] - b[0]);
        int n = intervals.length;
        int[][] ans = new int[n][2];
        int i = 0;
        int k = 0;
        while(i < n) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            int j = i + 1;
            while(j<n && intervals[j][0] <= end) {
                end = Math.max(end,intervals[j][1]);
                j++;
            }
            ans[k][0] = start;
            ans[k][1] = end;
            k++;

            i=j;
        }
        return Arrays.copyOf(ans,k);
    }
}