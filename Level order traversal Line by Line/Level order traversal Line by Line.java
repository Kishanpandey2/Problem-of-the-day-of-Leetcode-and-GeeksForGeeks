
class Level_Order_Traverse
{
   
    static ArrayList<ArrayList<Integer>> levelOrder(Node node) 
    {
        Queue<Node>q = new LinkedList<>() ;
        
        q.add(node);
        ArrayList<ArrayList<Integer>>ans  = new ArrayList<>() ;
        
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer>t1= new ArrayList<>();
            for(int i = 0 ;i<size;i++){
            Node temp =q.poll();
            t1.add(temp.data);
            
            if(temp.left != null)
            q.add(temp.left);
            if(temp.right != null)
            q.add(temp.right);
            }
            ans.add(t1);
        }
        
        return ans;
    }
}
