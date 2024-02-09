
/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	
	Node(int key)
	{
	    data = key;
	    left = right = null;
	}
}

*/
class Solution
{
     
    public static int isSumProperty(Node root)
    {
       return helper(root)?1:0 ;
    }
    
    
   static boolean  helper(Node root){
        if(root == null)return true ;
        
        if(root.left == null && root.right == null)return true ;
        
        int sum = 0 ;
        
        if(root.left != null) sum += root.left.data ;
        if(root.right != null) sum += root.right.data ;
        
        return (root.data == sum && helper(root.left ) && helper(root.right)) ;
    }
    
    
}
