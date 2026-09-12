class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];
        for(char ch: s.toCharArray()) {
            freq[ch]++;
        }
        Character[] arr = new Character[s.length()];
        for(int i = 0; i < s.length() ; i++) {
            arr[i] = s.charAt(i);
        }

        Arrays.sort(arr,(a,b) -> {
            if(freq[a]== freq[b]) {
                return a-b;
            }
            return freq[b] - freq[a];
        });

        StringBuilder ans = new StringBuilder();
        for(char ch:arr){
            ans.append(ch);
        }
        return ans.toString();
    }
}