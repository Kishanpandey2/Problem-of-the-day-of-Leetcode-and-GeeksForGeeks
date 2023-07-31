
class Solution {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
         ArrayList<Integer>al = new ArrayList<>() ;
         Queue<Integer>q = new LinkedList<>() ;
         boolean vis[] = new boolean[V] ;
         vis[0] = true ;
        q.add(0) ;
        while(!q.isEmpty()){
            int cur  = q.poll() ;
            al.add(cur);
            for(int nei : adj.get(cur)) {
                if(!vis[nei]){
                    vis[nei] = true;
                    q.add(nei) ;
                }
            }
        }
        return al;
    }
}
