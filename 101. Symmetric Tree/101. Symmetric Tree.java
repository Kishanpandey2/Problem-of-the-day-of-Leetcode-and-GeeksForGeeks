class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root== null || helpFunction(root.left , root.right);
    }
    boolean helpFunction(TreeNode left , TreeNode right) 
    {
        if(left == null || right == null)
        return left == right ;

        if(left.val != right.val)
        return false ;

        return helpFunction(left.left,right.right) &&  helpFunction(left.right,right.left) ;
    }
}
