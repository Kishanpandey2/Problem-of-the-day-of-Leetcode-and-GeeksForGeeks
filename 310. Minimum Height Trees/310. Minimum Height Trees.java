class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer>ans =new ArrayList<>();
        
        if(n ==1){
            ans.add(0) ;
            return ans ;
        }

        Map<Integer,Set<Integer>>graph = new HashMap<>() ;

        int []deg = new int[n] ;

        for(int []ed : edges)
        {
            deg[ed[0]]++ ;
            deg[ed[1]]++ ;

            graph.putIfAbsent(ed[0],new HashSet<>()) ;
            graph.get(ed[0]).add(ed[1]);

            graph.putIfAbsent(ed[1],new HashSet<>()) ;
            graph.get(ed[1]).add(ed[0]);
        }


        Queue<Integer>que = new LinkedList<>() ;

        for(int i = 0 ;i<n;i++)
        if(deg[i]==1)que.add(i) ;

        int cnt = n ;

        while(cnt>2){
            int size  = que.size() ;
            cnt -= size ;

            while(size-- >0){
                int leaf = que.poll() ;

                for(Integer next : graph.get(leaf))
                {
                    deg[next]-- ;
                    
                    if(deg[next]==1)
                    que.add(next);
                }
            }
        }

        ans.addAll(que) ;

        return ans;
    }


}
