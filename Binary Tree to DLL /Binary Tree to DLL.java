
/* class Node
class Node
{
	Node left, right;
	int data;
	
	Node(int d)
	{
		data = d;
		left = right = null;
	}
	
}*/

 

class Solution
{
    
    Node prev = null;
    Node bToDLL(Node root)
    {   
	   if(root == null)
	   return root ;
	   
	   Node head = bToDLL(root.left);
	   
	   if(prev == null)
	   head = root ;
	   else
	   {
	       root.left = prev;
	       prev.right = root;
	   }
	   prev = root;
	   bToDLL(root.right);
	   return head;
    }
    
      
}
