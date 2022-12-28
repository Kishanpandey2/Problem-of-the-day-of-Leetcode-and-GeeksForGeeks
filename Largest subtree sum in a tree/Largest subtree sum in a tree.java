class Solution {
   public static int res;
    public static int findLargestSubtreeSum(Node root) {
        // code here
        res =  Integer.MIN_VALUE ;
     
        postOrder(root);
        return res; 
    }
    public static int  postOrder(Node root )
    {
        if(root == null)
        return 0 ;
        int l = postOrder(root.left) ;
        int r = postOrder(root.right) ;
        res =  Math.max(res,l+r+root.data) ;
        return root.data+l+r;
    }
}
       

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
