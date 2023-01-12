class Solution {
    private int[] res ;
    private List<List<Integer>>adjList ;
    private Set<Integer>vis ;
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        res = new int[n] ;
        adjList = new ArrayList<>() ;
        for(int i = 0 ;i<n;i++)
        {
           adjList.add(new ArrayList<>() ) ;
        }
        for(int []ed : edges)
        {
            adjList.get(ed[0]).add(ed[1]) ;
            adjList.get(ed[1]).add(ed[0]) ;
        }
        vis = new HashSet<>() ;
        dfs(0,labels) ;
        return res ;
    }
    private int[] dfs(int node , String labels)
    {
        vis.add(node) ;
        int []cnt = new int[26] ;
        for(int ele: adjList.get(node))
        {
            if(!vis.contains(ele))
            {
                int adjCount[] = dfs(ele,labels) ;
                for(int i =0 ;i<26;i++)
                cnt[i]+=adjCount[i] ;
            }

        }
        char ch = labels.charAt(node) ;
        cnt[ch-'a']++;
        res[node ]= cnt[ch-'a'];
        return cnt ;
    }
}


Time Complexity -> O(n) 
Space Complexity -> O(n)
