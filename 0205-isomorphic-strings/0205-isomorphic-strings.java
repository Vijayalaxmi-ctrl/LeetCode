class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character,Character> mp = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for(int i = 0 ; i < s.length() ; i++) {
            if(mp.containsKey(s.charAt(i))) {
                if(mp.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                if(set.contains(t.charAt(i))) {
                    return false;
                }

            }
            mp.put(s.charAt(i),t.charAt(i));
            set.add(t.charAt(i));
        }
        return true;
    }
}