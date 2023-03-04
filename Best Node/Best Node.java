class Solution {
    public static long bestNode(int N, int[] A, int[] P) {
        Set<Integer> non_leaf = new HashSet<>();
        for(int i=0; i<N; i++)
            non_leaf.add(P[i]);
            
            //s2
        ArrayList<Integer> leaf_node = new ArrayList<>();
        for(int i = 1; i <= P.length; i++){
            if(!non_leaf.contains(i))
                leaf_node.add(i);
        }
        
        //s3
          //traverse from leaf to root and store max at each and every time visited new node
        //adv : 1. we know in which dir to move since parent is already def
        // as in moving from root have to track both sides.
          int ans = Integer.MIN_VALUE;
        for(int leaf : leaf_node )
        {
            int curr_node = leaf;
            int sum=0;
            while(curr_node!=-1) //while curr_node  reaches  root ie == -1
            {
                sum = -sum;
                sum+= A[curr_node-1];
                ans = Math.max(ans, sum);
                curr_node = P[curr_node-1];
            }
        }
        return ans;
    }
}
        
