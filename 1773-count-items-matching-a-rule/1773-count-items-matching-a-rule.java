class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        String[] type = new String[items.size()];
        String[] color = new String[items.size()];
        String[] name = new String[items.size()];

        // while(items != null) {
            int i = 0;
            int j = 0;

            for(int l = 0; l < items.size() ; l++) {
                type[l] = items.get(l).get(0);
            }
            for(int l = 0; l < items.size() ; l++) {
                color[l] = items.get(l).get(1);
            }
            for(int l = 0; l < items.size() ; l++) {
                name[l] = items.get(l).get(2);
            }
        
        int c = 0;
        if(ruleKey.equals("type")) {
            for(int x = 0 ; x < items.size(); x++) {
                if(ruleValue.equals(type[x])) {
                    c++;
                }
            }
        }
        if(ruleKey.equals("color")) {
            for(int x = 0 ; x < items.size(); x++) {
                if(ruleValue.equals(color[x])) {
                    c++;
                }
            }
        }
        if(ruleKey.equals("name")) {
            for(int x = 0 ; x < items.size(); x++) {
                if(ruleValue.equals(name[x])) {
                    c++;
                }
            }
        }
        return c;
    }
}