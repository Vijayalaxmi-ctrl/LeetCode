class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char ch : s.toCharArray()) {
            freq.put(ch,freq.getOrDefault(ch,0) + 1);
        }

        ArrayList<Character>[] buck = new ArrayList[s.length() + 1];

        for(int i = 0 ; i < buck.length ; i++) {
            buck[i] = new ArrayList<>();
        } 
        for(Map.Entry<Character,Integer> entry : freq.entrySet()) {
            char ch = entry.getKey();
            int fq = entry.getValue();
            buck[fq].add(ch);
        }
        StringBuilder ans =new StringBuilder();
        for(int i = s.length() ; i>=1; i--) {
            for(char ch : buck[i]) {
                for(int j = 0 ; j < i ; j++) {
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}