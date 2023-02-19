class Solution {
    
     Node first = null; Node second =null;
    Node prev = null;
    public Node correctBST(Node root) {
        
        fixBst(root);
        
        int temp = first.data;
        first.data = second.data;
        second.data = temp;
        
        return root;
    }
    
    void fixBst(Node root)
    {
        if(root==null) return;
        
        fixBst(root.left);
        if(prev!=null && root.data<prev.data)
        {
            if(first==null) first=prev;
            
            second = root;
        }
        prev =root;
        fixBst(root.right);
    }
}
