
/*
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree
{
     
     ArrayList<Integer> Kdistance(Node root, int k)
     {
          ArrayList<Integer>al =new ArrayList<Integer>() ;
      
          
          Queue<Node>q = new LinkedList<>() ;
          
          q.add(root) ;
          
          int level  = 0 ;
          while(!q.isEmpty() ){
              int size = q.size() ;
              
              for(int i  = 0 ;i<size;i++){
                  Node node = q.poll() ;
                  if(level == k)
                  al.add(node.data);
                  
                  if(node.left != null)
                  q.add(node.left);
                  
                   if(node.right != null)
                  q.add(node.right);
                  
                  
              }
              
              if(level>=k)break;
              level++;
          }
          
          return al;
     }
}
