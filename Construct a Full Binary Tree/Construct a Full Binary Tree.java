
class Solution
{
     int preIndex = 0 ;
    public Node constructBTree(int pre[], int preM[], int size)
    {
        // your code here
         Node root = build(pre, preM, 0, size - 1);
        return root;
        
    }
    Node build(int[] pre, int[] preM, int l, int h) {
        if (preIndex > pre.length-1 )
            return null;
        
        
        //make new node - first
        Node root = new Node(pre[preIndex++]);
        
        if (l == h)
            return root;
            
        int i; 
        //search next
        for (i = l; i <= h; ++i) {
            if (pre[preIndex] == preM[i])
                break;
        }
        
        root.left = build(pre, preM, i, h);
        root.right = build(pre, preM,  l + 1, i - 1);
        
        return root;
    }
    
    
}
