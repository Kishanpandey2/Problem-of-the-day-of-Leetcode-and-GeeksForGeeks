class Solution {
    public List<TreeNode> allPossibleFBT(int n) {
        if(n == 1)
        {
          List<TreeNode> ans = new ArrayList<>() ;
          ans.add(new TreeNode(0));
          return ans;   
        }
     List<TreeNode> ans = new ArrayList<>() ;
        for(int i = 1;i<n;i+=2){
            List<TreeNode> left = allPossibleFBT(i);
             List<TreeNode> right = allPossibleFBT(n-i-1) ;
            for(TreeNode l : left){
                for(TreeNode r : right)
                {
                    TreeNode root = new TreeNode(0) ;
                    root.left = l ;
                    root.right = r;
                    ans.add(root);
                }
            }

        }
        return ans;
    }
}
