class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length() ;i++) {
            char curr = s.charAt(i);
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            }
            else {
                if(st.isEmpty()) {
                    return false;
                }
                char ch = st.pop();
                //st.pop();
                if((char)s.charAt(i) == ')' && ch == '(' || (char)s.charAt(i) == ']' && ch == '[' || (char)s.charAt(i) == '}' && ch == '{' ) {
                    continue;
                }
                else {
                    return false;
                }

            }

        }
        return st.isEmpty();
    }
}