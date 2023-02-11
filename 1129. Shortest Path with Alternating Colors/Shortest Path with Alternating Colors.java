class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        Map<Integer,List<List<Integer>>> graph = new HashMap<>() ;
        for(int []e : redEdges){
            graph.computeIfAbsent(e[0],k-> new ArrayList<List<Integer>>()).add(Arrays.asList(e[1],1)) ;
        }
         for(int []e : blueEdges){
            graph.computeIfAbsent(e[0],k-> new ArrayList<List<Integer>>()).add(Arrays.asList(e[1],0)) ;
        }
        boolean [][]vis = new boolean[n][2] ;
        int []res = new int[n] ;
        Arrays.fill(res,-1) ;
        Queue<int []>q = new LinkedList<>() ;
        q.offer(new int[]{0,0,-1}) ;
        vis[0][0]= vis[0][1] = true ;
        res[0] = 0 ;
        while(!q.isEmpty()){
            int []cur = q.poll() ;
            int node = cur[0],dis = cur[1], prevColor = cur[2] ;
            if(!graph.containsKey(node))
            continue ;
            for(List<Integer>next:graph.get(node)){
                int nextNode = next.get(0),Color = next.get(1) ;
                
                if(!vis[nextNode][Color] && prevColor != Color){
                    if(res[nextNode]== -1)
                res[nextNode]= 1+dis ;
                    vis[nextNode][Color]=true ;
                    q.offer(new int[]{nextNode ,1+dis,Color}) ;
                }
            }
        }
        return res ;
    }
}
