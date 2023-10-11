class Node
{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left = right = null;		
	}
} */

class Tree
{
    
    boolean isBalanced(Node root)
    {
     return help(root)!= -1 ;
    }
    int help(Node root){
        if(root == null)return 0 ;
     
     int left = help(root.left) ;
     if(left == -1)return -1 ;
     
     int right = help(root.right) ;
     if(right == -1)return -1 ;
     
     int dif = Math.abs(left-right) ;
     if(dif>1)return -1 ;
     
     return 1+ Math.max(left, right) ;
    }
}
