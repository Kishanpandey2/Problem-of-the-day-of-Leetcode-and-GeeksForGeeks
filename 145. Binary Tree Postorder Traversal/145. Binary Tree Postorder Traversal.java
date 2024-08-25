class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>ans = new ArrayList<>() ;

        postOrder(root,ans);
        return ans;
    }

    void postOrder(TreeNode root,List<Integer>ans){
        if(root != null){
            postOrder(root.left,ans);
            postOrder(root.right,ans);
            ans.add(root.val) ;
        }
    }
}
