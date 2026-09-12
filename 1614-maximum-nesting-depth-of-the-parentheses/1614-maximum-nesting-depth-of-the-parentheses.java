class Solution {
    public int maxDepth(String s) {
        int maxOpen = 0;
        int currentOpen = 0;
        for(int i = 0 ; i < s.length() ; i++ ) {
            if(s.charAt(i) == '(') {
                currentOpen++;
                if(currentOpen > maxOpen) {
                    maxOpen = currentOpen;
                }
            }
            else if(s.charAt(i) == ')') {
                currentOpen--;
            }else {
                continue;
            }
        }
        return maxOpen;
    }
}