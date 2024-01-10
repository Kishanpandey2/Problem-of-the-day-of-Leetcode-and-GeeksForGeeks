/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private void createGraph(TreeNode root,ArrayList<Integer>[]graph){
            if(root== null)return ;

            if(root.left!= null)
            {
                createGraph(root.left,graph) ;
                graph[root.val].add(root.left.val);
                graph[root.left.val].add(root.val);
            }
             if(root.right!= null)
            {
                createGraph(root.right,graph) ;
                graph[root.val].add(root.right.val);
                graph[root.right.val].add(root.val);
            }
    }
    private int dfsDepth(int src,ArrayList<Integer>[]graph,int []vis){
        vis[src] = 1 ;
        int ans = 0  ;

        for(int nei : graph[src])
        {
            if(vis[nei]==0)
            ans = Math.max(ans,dfsDepth(nei,graph,vis)+1);
        }

        return ans;
    }
    public int amountOfTime(TreeNode root, int start) {
        ArrayList<Integer>[]graph = new ArrayList[100001];

        
        for(int i = 0 ;i<graph.length;i++)
        graph[i] = new ArrayList<>() ;

        createGraph(root,graph) ;

        return dfsDepth(start, graph,new int[100001]) ;
    }
}
