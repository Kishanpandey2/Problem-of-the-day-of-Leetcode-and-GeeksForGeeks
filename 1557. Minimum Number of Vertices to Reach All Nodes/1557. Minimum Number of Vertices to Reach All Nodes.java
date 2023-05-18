class Solution {
     public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
            int[] inDegree = new int[n];
            for (List<Integer> e : edges) {
                inDegree[e.get(1)]++;
            }

            List<Integer> result = new ArrayList();
            for (int i = 0; i < n; i++)
                if (inDegree[i] == 0)
                    result.add(i);

            return result;
        }
}
