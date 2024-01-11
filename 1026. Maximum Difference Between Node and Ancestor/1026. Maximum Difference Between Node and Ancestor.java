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
    int d = 0 ;
    public int maxAncestorDiff(TreeNode root) {
        help(root) ;
        return d ;
    }
    int [] help(TreeNode root)
    {
        if(root == null)
        return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
        if(root.left == null && root.right == null)
        return new int[]{root.val,root.val};
        int []lft = help(root.left) ;
        int []rgt = help(root.right) ;
        int mn = Math.min(lft[0],rgt[0]);
        int mx = Math.max(lft[1],rgt[1]);
         d = Math.max(d, Math.max(Math.abs(mn-root.val),Math.abs(mx-root.val)));
        mn = Math.min(mn,root.val);
        mx = Math.max(mx,root.val);
        return new int[]{mn,mx};
    }
}
