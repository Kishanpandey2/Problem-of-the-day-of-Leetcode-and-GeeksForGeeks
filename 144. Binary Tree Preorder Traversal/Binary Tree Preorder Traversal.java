class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>ans = new ArrayList<>() ;
       solve(root,ans );
        return ans ;

    }
    TreeNode solve(TreeNode root , List<Integer>ans)
    {
        if(root == null)
      { 
           return null ;
      }ans.add(root.val) ;
        root.left = solve(root.left, ans) ;
        
        root.right = solve(root.right, ans) ;
        return null ;
    }
}
