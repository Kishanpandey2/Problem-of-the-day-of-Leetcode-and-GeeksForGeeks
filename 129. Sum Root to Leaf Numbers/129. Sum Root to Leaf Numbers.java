class Solution {
    private int ans ;
    public int sumNumbers(TreeNode root) {
        if(root == null)
        return 0 ;
        ans = 0 ;
        helperFunction(root,0);
        return ans ;
    }
    public void helperFunction(TreeNode root, int val){
        int  curr = val*10+ root.val ;

        if(root.left == null && root.right == null){
            ans += curr ;
            return ;
        }

        if(root.left != null)
        helperFunction(root.left , curr) ;
        if(root.right != null)
        helperFunction(root.right , curr) ;
    }
}
