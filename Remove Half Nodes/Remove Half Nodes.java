
class Solution {
   
    public Node RemoveHalfNodes(Node root) {
       
        return help(root);
    }
    Node help(Node root)
    {
        if(root.left  == null && root.right== null)return root ;
        else if(root.left != null && root.right != null)
        {
            root.left = help(root.left);
            root.right  =help(root.right);
        }
        if(root.left== null && root.right != null)
        return help(root.right);
        
        if(root.left!= null && root.right == null)
        return help(root.left);
        
        return root;
        
        
    }
}
