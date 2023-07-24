// Method 1  ( Using level order Traversal) 
class Solution{
   
    ArrayList<Integer> rightView(Node node) {
        ArrayList<Integer> ans = new ArrayList<>() ;
        Queue<Node>q = new LinkedList<>() ;
        q.add(node) ;
        while(!q.isEmpty())
        {
           
            int size =q.size() ;
            for(int i = 0 ;i<size;i++)
            {
                Node temp = q.poll() ;
                if(i==size-1)
                ans.add(temp.data) ;
                if(temp.left!=null)
                q.add(temp.left);
                if(temp.right!=null)
                q.add(temp.right);
                
            }
        }
        return ans;
    }
     
}


// Method 2 (Uisng Recursion )

class Solution{
 ArrayList<Integer>  ans = new ArrayList<>() ;
 int mxLevel = 1 ;
    ArrayList<Integer> rightView(Node node) {
        ans.add(node.data);
      help(node , 1);
      
      return ans;
    }
    void help(Node root , int level ){
        if(root == null)
        return  ;
        
        if(mxLevel<level)
        {
            ans.add(root.data) ;
            mxLevel = level;
        }
        help(root.right,level+1);
        help(root.left,level+1) ;
    }
}

