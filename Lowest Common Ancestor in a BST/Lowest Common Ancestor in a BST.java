
class BST
{   
      
	Node LCA(Node root, int n1, int n2)
	{
         while(root!= null)
         {
             if(root.data>n1 && root.data>n2)
             root = root.left ;
             else if(root.data<n1 && root.data<n2)
             root = root.right ;
             else break;
         }
         
         return root;
    }
    
}
