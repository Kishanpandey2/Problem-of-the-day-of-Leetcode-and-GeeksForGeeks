class DSU {
    int[] parent;
    int[] rank;
    
    public DSU(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }
    
    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    
    public boolean union(int x, int y) {
        int xset = find(x), yset = find(y);
        if (xset != yset) {
            if (rank[xset] < rank[yset]) {
                parent[xset] = yset;
            } else if (rank[xset] > rank[yset]) {
                parent[yset] = xset;
            } else {
                parent[xset] = yset;
                rank[yset]++;
            }
            return true;
        }
        return false;
    }
}

class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        Arrays.sort(edges, (a, b) -> Integer.compare(b[0], a[0]));
        
        DSU dsu_alice = new DSU(n+1);
        DSU dsu_bob = new DSU(n+1);
        
        int removed_edge = 0, alice_edges = 0, bob_edges = 0;
        for (int[] edge : edges) {
            if (edge[0] == 3) {
                if (dsu_alice.union(edge[1], edge[2])) {
                    dsu_bob.union(edge[1], edge[2]);
                    alice_edges++;
                    bob_edges++;
                } else {
                    removed_edge++;
                }
            } else if (edge[0] == 2) {
                if (dsu_bob.union(edge[1], edge[2])) {
                    bob_edges++;
                } else {
                    removed_edge++;
                }
            } else {
                if (dsu_alice.union(edge[1], edge[2])) {
                    alice_edges++;
                } else {
                    removed_edge++;
                }
            }
        }
        
        return (bob_edges == n - 1 && alice_edges == n - 1) ? removed_edge : -1;
    }
}
