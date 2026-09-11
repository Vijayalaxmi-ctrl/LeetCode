class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }
        for(int i = 0; i <s.length();i++) {
            char first = s.charAt(0);
            String rotated = "";
            for(int j = 1; j < s.length();j++) {
                rotated += s.charAt(j);
            }
            rotated += first ;
            s = rotated;
            if(rotated.equals(goal)) {
                return true;
            }
        }
        return false;
    }
}