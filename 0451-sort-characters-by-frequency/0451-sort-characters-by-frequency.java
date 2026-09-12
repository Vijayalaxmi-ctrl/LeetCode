class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char ch:s.toCharArray()) {
            freq.put(ch,freq.getOrDefault(ch,0) +1);
        }

        ArrayList<Character> arr = new ArrayList<>(freq.keySet());
        Collections.sort(arr,(a,b) -> {
            return freq.get(b) - freq.get(a);
        });

        StringBuilder ans = new StringBuilder();

        for(char ch : arr) {
            int count = freq.get(ch);

            for(int i = 0; i < count ;i++) {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}