class Solution
{
    int noOfNode = 0 ;
    public int kthAncestor(Node root, int k, int node)
    {
        length(root) ;
        
        int []parent = new int[noOfNode+1];
            
            fillParent(root,parent);
            int cnt = 0;
            while(node != -1){
                node = parent[node];
                cnt++;
                
                if(cnt == k)
                return node ;
            }
            return -1;
        
    }
    
    private void fillParent(Node root , int []parent){
        Queue<Node > q =  new LinkedList<>();
        parent[root.data] = -1;
        q.add(root);
        
        while(!q.isEmpty()){
            Node temp = q.poll();
            
            if(temp.left != null)
            {
                q.add(temp.left) ;
                parent[temp.left.data] = temp.data;
            }
            
            if(temp.right != null)
            {
                q.add(temp.right) ;
                parent[temp.right.data] = temp.data;
            }
        }
    }
    
    private void length(Node root){
        if(root== null)return ;
        
        length(root.right); 
        noOfNode++;
        length(root.left);
    }
}
