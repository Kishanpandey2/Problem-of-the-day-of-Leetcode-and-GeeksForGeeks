class Solution{
    public void toSumTree(Node root){
         function(root) ;
    }
    int function(Node root)
    {
        if(root == null)
        return 0 ;
        int temp = root.data ;
        root.data = function(root.left)+function(root.right) ;
        return temp+root.data;
    }
}


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(height of tree)
