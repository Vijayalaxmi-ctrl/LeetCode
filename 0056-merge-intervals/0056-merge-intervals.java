class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(
            intervals,
            (a,b) -> Integer.compare(a[0],b[0])
        );
        List<int[]> merged = new ArrayList<>();
        for(int i = 0 ; i  < intervals.length ; i++) {
            if(merged.isEmpty() || merged.get(merged.size()-1)[1] < intervals[i][0]) {
                merged.add(new int[] {intervals[i][0],intervals[i][1]});
            } else {
                int last = merged.size()-1;
                int max = Math.max(merged.get(last)[1],intervals[i][1]);
                merged.get(last)[1] = max;
        }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}