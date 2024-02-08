/* A Binary Tree node
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
    boolean check(Node root)
    {
Queue<Node> q=new LinkedList<>();
	   q.add(root);
	   int i=0;
	   int last=-1;
	   while(!q.isEmpty()){
	       
	       int len=q.size();
	       
	       
	       for(int j=0;j<len;j++){
	           Node node=q.poll();
    	       
    	           if(node.left!=null){
    	               q.add(node.left);
    	           }
    	           if(node.right!=null){
    	               q.add(node.right);
    	           }
	           
	           if(node.left==null && node.right==null){
	               if(last==-1 ) last=i;
	               else if(last!=i) return false;
	           }
	           
	       }
	       i++;
	      
	   }
	   
	   return true;	
    }
}
