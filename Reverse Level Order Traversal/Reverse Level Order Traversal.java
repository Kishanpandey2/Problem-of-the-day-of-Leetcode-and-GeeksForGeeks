
/* 
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        ArrayList<Integer>ans = new ArrayList<>() ;
        Stack<Node>st = new Stack<>() ;
        
        Queue<Node>q = new LinkedList<>() ; 
        q.add(node) ;
        
        while(!q.isEmpty()){
            int size = q.size() ;
        
            for(int i = 0 ;i<size;i++)
            {
                Node root = q.poll() ;
                st.add(root);
                
                if(root.right != null)
                q.add(root.right) ;
                
                if(root.left != null)
                q.add(root.left) ;
                
                
            }

        }
        
        while(!st.isEmpty())
        {
            Node temp = st.pop() ;
            
            ans.add(temp.data);
        }
        return ans;
    }
}      
