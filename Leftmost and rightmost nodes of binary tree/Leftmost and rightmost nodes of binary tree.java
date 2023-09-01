class Tree
{
    public static void printCorner(Node node)
    {
        
        Queue<Node > q = new LinkedList<>() ;
        q.add(node);
        
        while(!q.isEmpty()){
            int n = q.size() ;
            for(int i = 0;i<n;i++){
                Node temp = q.poll() ;
                if(i == 0 || i==n-1)
                System.out.print(temp.data+" ") ;
                
                if(temp.left!=null)
                q.add(temp.left);
                
                if(temp.right!=null)
                q.add(temp.right);
            }
        }
    }
    
}
