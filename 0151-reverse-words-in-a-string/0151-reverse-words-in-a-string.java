class Solution {
    public String reverseWords(String s) {
        List<String> words = new ArrayList<>();
        int n = s.length();
        int i = 0;
        while(i<n) {
            while(i < n && (s.charAt(i) == ' ')) {
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
            words.add(word);
        }
        Collections.reverse(words);

        String result = "";
        for(int j = 0 ; j < words.size() ; j++)  {
            result += words.get(j);
            if(j != words.size() - 1) {
                result += " ";
            }
        }
        return result;
    }
}