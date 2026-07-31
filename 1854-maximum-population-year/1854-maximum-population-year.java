class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for(int log[] : logs) {
            arr[log[0] - 1950]++;
            arr[log[1] - 1950]--;         //year = index + 1950                  // index = 1950 - yr
        }

        int maxPop = arr[0];
        int currPop = arr[0];
        int year = 1950;

        for(int i = 1 ; i < 101 ; i++) {
            arr[i] += arr[i - 1];
            if(maxPop < arr[i]) {
                maxPop = arr[i];
                year = 1950 + i;
            }
            
        }
        return year;
    }
}