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
    public boolean isEvenOddTree(TreeNode root) {
    Queue<TreeNode>q = new LinkedList<>() ;

     q.add(root) ;
        int level = 0 ;
        boolean flag = true ;
     while(!q.isEmpty()){
         int size = q.size() ;
         int prev = flag ? Integer.MIN_VALUE : Integer.MAX_VALUE ;
         
         for(int i = 0 ;i<size;i++)
         {
                
             TreeNode r = q.poll() ;
            if(flag)
              {
                if(r.val % 2==0 || prev >= r.val )return false;
             }
             else
             if(r.val % 2 !=0 || prev <= r.val )return false;


             if(r.left != null)
             q.add(r.left) ;

             if(r.right != null)
             q.add(r.right);

             prev = r.val ;
         }
        flag = !flag ;
     }

     return true ;
    }
}
