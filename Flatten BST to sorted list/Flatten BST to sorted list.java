class Solution {
    Node prev ;
    public Node flattenBST(Node root) {
      Node newNode = new Node(-2) ;
      
      prev = newNode ;
      inorder(root) ;
      prev.left  = null ;
      prev.right = null;
      return newNode.right ;
    }
    void inorder(Node root)
    {
        if(root != null)
        {
            inorder(root.left) ;
            
            prev.left =null ; prev.right = root;
            
            prev = root ;
            
            inorder(root.right);
        }
    }
}
