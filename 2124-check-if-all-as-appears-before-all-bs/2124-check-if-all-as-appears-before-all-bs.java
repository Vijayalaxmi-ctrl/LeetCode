class Solution {
    public boolean checkString(String s) {
        int n = s.length() ; 
        int lastApos = -1;
        int firstBpos = n;
        for(int i = 0; i < s.length() ; i++) {
            if(s.charAt(i) == 'a') {
                lastApos = i;
            }else if(s.charAt(i) == 'b' && firstBpos == n) {
                firstBpos = i;
            }
        }
        return lastApos < firstBpos;
    }
}