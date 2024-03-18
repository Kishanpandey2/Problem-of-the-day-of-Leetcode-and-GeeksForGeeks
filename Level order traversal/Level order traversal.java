
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
class Solution
{
    static ArrayList <Integer> levelOrder(Node root) 
    {
      ArrayList<Integer>al = new ArrayList<>() ;
       
       Queue<Node>q = new LinkedList<>() ;
       
       q.add(root) ;
       
       while(!q.isEmpty())
       {
           int size = q.size() ;
           
           for(int i = 0 ;i<size;i++)
           {
               Node node = q.poll()  ;
               
               al.add(node.data) ;
               if(node.left!= null)
               q.add(node.left) ;
               
                if(node.right!= null)
               q.add(node.right) ;
           }
       }
       
       return al;
    }
}





