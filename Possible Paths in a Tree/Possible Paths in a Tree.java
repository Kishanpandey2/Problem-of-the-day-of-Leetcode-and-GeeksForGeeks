class Solution {
    int ans;

 
    private int root(int i, int[] parent) {
        while (parent[i] != i) {
            parent[i] = parent[parent[i]];
            i = parent[i];
        }
        return i;
    }

 
    private int union(int a, int b, int[] parent, int[] sz) {
        int ra = root(a, parent);
        int rb = root(b, parent);
        if (ra == rb)
            return sz[ra] * sz[ra];
        if (sz[ra] < sz[rb]) {
            int temp = ra;
            ra = rb;
            rb = temp;

 
            temp = a;
            a = b;
            b = temp;
        }

 
        ans += sz[ra] * sz[rb];
        parent[rb] = ra;
        sz[ra] += sz[rb];

 
        return ans;
    }

 
    public ArrayList<Integer> maximumWeight(int n, int[][] edges, int q, int[] queries) {
        ans = 0;

 
        int[] parent = new int[n + 1];
        int[] sz = new int[n + 1];

 
        for (int i = 0; i <= n; i++) {
            parent[i] = i;
            sz[i] = 1;
        }

 
        ArrayList<int[]> wt = new ArrayList<>();
        for (int i = 0; i < n - 1; i++)
            wt.add(new int[]{edges[i][2], edges[i][0], edges[i][1]});
        wt.sort((a, b) -> Integer.compare(a[0], b[0]));

 
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for (int i = 0; i < n - 1; i++) {
            int a = wt.get(i)[0];
            int b = wt.get(i)[1];
            int c = wt.get(i)[2];
            mp.put(a, union(b, c, parent, sz));
        }

 
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            Map.Entry<Integer, Integer> val = mp.floorEntry(queries[i]);
            if (val == null)
                res.add(0);
            else
                res.add(val.getValue());
        }

 
        return res;
    }

}
