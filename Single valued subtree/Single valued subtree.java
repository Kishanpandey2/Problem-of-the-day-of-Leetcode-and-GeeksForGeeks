
class Solution
{
    public int ans  ;
    public int singlevalued(Node root)
    {
       
         ans = 0 ;
        solve(root) ;
        return ans;
    }
    boolean solve(Node root)
    {
        if(root == null)return true;
        boolean l = solve(root.left) ;
        boolean r = solve(root.right ) ;
        if(l == false  || r== false)
        return false ;
       if(root.left != null && (root.left.data != root.data ))
       return false ;
       if(root.right != null && (root.right.data != root.data ))
       return false ;
       ans++;
       return true;
       
    }
}

Expected Time Complexity : O(n)
Expected Auxiliary Space : O(n)
