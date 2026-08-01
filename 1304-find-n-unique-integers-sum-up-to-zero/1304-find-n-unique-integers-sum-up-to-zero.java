class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int k = 0;
        for(int i = 1 ; i <= n / 2 ; i++) {
            arr[k++] = i;
            arr[k++] = -i;
        }
        if(n%2 == 1) {
            arr[k] = 0;
        }
        return arr;
    }
}