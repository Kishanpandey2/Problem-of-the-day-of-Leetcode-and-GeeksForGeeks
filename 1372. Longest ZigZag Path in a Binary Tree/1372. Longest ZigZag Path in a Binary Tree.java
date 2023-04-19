class Solution {
    int maxLength = 0 ;
    public void solve(TreeNode root , int dir ,int curLen){
        if(root == null)
        return ;
        maxLength = Math.max(maxLength , curLen) ;
        if(dir == 1){
        solve(root.left, 0 ,curLen+1);
         solve(root.right, 1,1);
        }
        else{
         solve(root.right, 1 ,curLen+1);
         solve(root.left, 0,1);
        }
       
    }
    public int longestZigZag(TreeNode root) {
        solve(root,0,0);
        solve(root,1,0) ;
        return maxLength ;
    }
}
