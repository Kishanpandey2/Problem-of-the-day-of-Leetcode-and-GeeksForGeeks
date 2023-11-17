/*
Node defined as
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class Solution
{ 
    Node   head = null , prev= null;
    ArrayList<Node> al = null;
    Node bTreeToClist(Node root)
    {
     al = new ArrayList<>();
     
     inOrder(root) ;
     
     for(int i = 0 ;i<al.size() ;i++)
     {
         Node cur = al.get(i) ;
         
         if(head == null)
         {
             head = prev = cur;
         }
         else
         {
             prev.right = cur;
             cur.left = prev ;
         }
         
         prev = cur;
     }
     prev.right = head ;
     head.left = prev ;
     
     return head;
    }
    private void inOrder(Node root){
        if(root == null)return ;
        
        inOrder(root.left) ;
        al.add(root) ;
        inOrder(root.right);
    }
}
    
