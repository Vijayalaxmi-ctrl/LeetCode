class Solution {
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    int[] resultSize;
    int[] last;

    public int[] findSubtreeSizes(int[] parent, String s) {
        int n = parent.length;

        for(int i = 0; i < n ; i++) {
            adj.add(new ArrayList<>());
        }

        for(int i = 1; i < n ; i++) {
            int u = parent[i];
            int v = i;
            adj.get(u).add(v);
        }
        resultSize = new int[n];
        Arrays.fill(resultSize,1);

        last = new int[26];
        Arrays.fill(last,-1);

        dfs(0,s,parent);

        return resultSize;
        
    }

    public void dfs(int currNode , String s ,int[] parent ) {
        int c = s.charAt(currNode) - 'a';
        int nearestAncestor = last[c];
        last[c] = currNode;
        for(int child : adj.get(currNode)) {
            dfs(child,s,parent);
        }
        last[c] = nearestAncestor;
       
        if(currNode != 0) {
            int newParent = parent[currNode];
            if(nearestAncestor != -1) 
            {
                newParent = nearestAncestor;
            }
            parent[currNode] = newParent;
            resultSize[newParent] += resultSize[currNode];
        }
        
    }
}