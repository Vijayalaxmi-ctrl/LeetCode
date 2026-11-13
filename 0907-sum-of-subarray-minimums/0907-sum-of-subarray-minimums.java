class Solution {
    public int sumSubarrayMins(int[] arr) {
        int[] nse = findNSE(arr);
        int[] pse = findPSE(arr);
        int total = 0;
        int mod = (int) (1e9+7);
        for(int i = 0; i < arr.length;i++) {
            int left = i - pse[i];
            int right = nse[i] -i;
            total =(int) ((total +  (long) right * left * arr[i]) % mod);
        }
        return total;
    }

    public int[] findNSE(int[] arr) {
        int[] nse = new int[arr.length];
        Stack<Integer> st= new Stack<>();
        for(int i = arr.length - 1; i >= 0;i--) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            nse[i] = st.isEmpty() ? arr.length :st.peek();
            st.push(i);
        }
        return nse;
    }

    public int[] findPSE(int[] arr) {
        int[] pse = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < arr.length;i++) {
            while(!st.isEmpty() && arr[st.peek()]>arr[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pse;
    }
}