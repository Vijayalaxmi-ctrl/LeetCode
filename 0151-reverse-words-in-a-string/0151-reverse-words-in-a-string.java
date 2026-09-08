class Solution {
    public String reverseWords(String s) {
        s = new StringBuilder(s).reverse().toString();
        int n = s.length();
        String ans = "";
        for(int i = 0; i < n ; i++) {
            while(i<n && s.charAt(i) == ' ') {
                i++;
            }
            if(i>=n) {
                break;
            }
            String word = "";
            while(i < n && s.charAt(i) != ' ') {
                word += s.charAt(i);
                i++;
            }
            word = new StringBuilder(word).reverse().toString();
            if(ans.length() > 0) {
                ans += " "+ word;
            }else {
                ans += word;
            }
        }
        return ans;
    }
}