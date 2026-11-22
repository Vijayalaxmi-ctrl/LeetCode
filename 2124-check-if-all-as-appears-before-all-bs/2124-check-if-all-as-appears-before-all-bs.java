class Solution {
    public boolean checkString(String s) {
        int flag =0;
        for(int i = 1; i < s.length() ; i++) {
            if(s.charAt(i) < s.charAt(i-1)){
                flag = 1;
                break;
            }
        }
        if(flag == 1) {
            return false;
        }
        return true;
    }
}