// Method 1 with O(n) Time as well as O(n) Space ;
class Solution
{
    
	public Node inorderSuccessor(Node root,Node x)
         {
          ArrayList<Node>al = new ArrayList<>() ;
            inOrder(al,root) ;
            
            for(int i = 0 ;i<al.size();i++)
            if(al.get(i)==x && i+1<al.size())return al.get(i+1);
            
        return null;
         }
          void inOrder(ArrayList<Node>al, Node root)
         {
             if(root == null)return ; 
             
             inOrder(al,root.left);
             al.add(root);
             inOrder(al,root.right) ;
         }
}

// method 2 with O(height of the tree) Time and O(1) Space
class Solution
{
     
	public Node inorderSuccessor(Node root,Node x)
         {
         Node res = null ;
         while(root!= null)
         {
             if(root.data>x.data)
             {
                 res = root ;
                 root = root.left ;
             }
             else
             root = root.right;
         }
         return res;
         }
}
