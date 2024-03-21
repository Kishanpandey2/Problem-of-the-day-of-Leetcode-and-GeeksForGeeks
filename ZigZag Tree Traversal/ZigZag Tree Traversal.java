
/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/

class GFG
{
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    	ArrayList<Integer> ans = new 	ArrayList<Integer>() ;
	    	Queue<Node>q = new LinkedList<>() ;
	    	
	    	q.add(root) ;
	    	boolean flag  =  false;
	    	while(!q.isEmpty()){
	    	    int size = q.size() ;
	    	    Stack<Integer>st = new Stack<>() ;
	    	    
	    	    for(int i = 0 ;i<size;i++){
	    	        Node temp = q.poll() ;
	    	        if(flag)
	    	        st.push(temp.data) ;
	    	        else
	    	        ans.add(temp.data) ;
	    	        
	    	        if(temp.left != null)
	    	        q.offer(temp.left) ;
	    	            if(temp.right != null)
	    	        q.offer(temp.right) ;
	    	    }
	    	    
	    	    while(!st.isEmpty())
	    	    ans.add(st.pop()) ;
	    	    
	    	    flag= !flag ;
	    	}
	    	
	    	return ans;
	    	   
	}
}
