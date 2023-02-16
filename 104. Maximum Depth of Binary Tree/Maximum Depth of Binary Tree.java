class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
        return 0 ;
        int lft = maxDepth(root.left) ;
        int rgt = maxDepth(root.right) ;
        return 1+Math.max(lft,rgt);
    }
}
