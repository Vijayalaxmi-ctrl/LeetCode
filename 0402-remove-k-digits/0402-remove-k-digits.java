class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(int i =0; i < num.length() ; i++) {
            while(!st.isEmpty() && k > 0 && st.peek() -'0' > num.charAt(i) - '0') {
                st.pop();
                k = k-1;
            }
            st.push(num.charAt(i));
        }

        while(k > 0) {
            st.pop();
            k--;
        }

        if(st.isEmpty()) {
            return "0";
        }

        StringBuilder resultant = new StringBuilder();
        while(!st.isEmpty()) {
            resultant.append(st.peek());
            st.pop();
        }

        while(resultant.length() != 0 && resultant.charAt(resultant.length()-1) == '0') {
            resultant.deleteCharAt(resultant.length() - 1);
        }
        resultant.reverse();
        if(resultant.isEmpty()) {
            return "0";
        }

        return resultant.toString();
    }
}