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
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode>q = new LinkedList<>() ;
        List<Integer>  ans= new ArrayList<>();
        if(root ==null)return ans;

        q.add(root) ;

        while(!q.isEmpty()){
            int max = Integer.MIN_VALUE ;
            int size = q.size() ;
            
            while(size-- > 0){
                TreeNode cur = q.poll() ;

                max = Math.max(max,cur.val) ;
                if(cur.left!= null)q.offer(cur.left) ;
                if(cur.right!= null)q.offer(cur.right) ;
            }
           ans.add(max) ;

        }
        return ans;
    }
}
