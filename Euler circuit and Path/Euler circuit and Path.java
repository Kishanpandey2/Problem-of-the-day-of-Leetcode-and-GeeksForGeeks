class Solution {
    public int isEulerCircuit(int v, List<Integer>[] adj) {
        int even = 0, odd = 0;
        for(int i = 0; i < v; i++) {
            if(adj[i].size() % 2 == 0)
                even++;
            else
                odd++;
        }
        
        return even == v ? 2 : odd > 0 && odd == 2 ? 1 : 0;
    }
}
