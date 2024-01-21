
class Solution {
     private static int getMin(int n, int m, int[][] edges, int idx, HashSet<Integer> st){
        if(idx >= m)
            return 0;
        int v1 = edges[idx][0];
        int v2 = edges[idx][1];
        
        if(!st.contains(v1) && !st.contains(v2)){
            st.add(v1);
            int first = 1 + getMin(n, m, edges, idx+1, st);
            st.remove(v1);
            
            st.add(v2);
            int second = 1 + getMin(n, m, edges, idx+1, st);
            st.remove(v2);
            
            return Math.min(first, second);
        }
        
        return getMin(n, m, edges, idx+1, st);
    }
    public static int vertexCover(int n, int m, int[][] edges) {
       
        HashSet<Integer> st = new HashSet<>();
        return getMin(n, m, edges, 0, st);
    }
}
        
