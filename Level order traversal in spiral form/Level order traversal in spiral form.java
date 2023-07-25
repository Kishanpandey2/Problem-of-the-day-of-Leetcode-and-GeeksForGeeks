class Spiral
{
    ArrayList<Integer> findSpiral(Node root) 
    {
          ArrayList<Integer> ans = new ArrayList<>() ;
          if(root == null)return ans ;
          
          if(root.left == null && root.right == null)
          {
              ans.add(root.data) ;return ans ;
          }
          
          Stack<Node >st1 = new Stack<>() ;
           Stack<Node>st2 = new Stack<>() ;

            st1.push(root);
           while(!st1.isEmpty() || !st2.isEmpty()){
               
               while(!st1.isEmpty()){
                   Node temp = st1.pop() ;
                   ans.add(temp.data) ;
                   
                   if(temp.right != null) st2.push(temp.right);
                   if(temp.left != null) st2.push(temp.left);
               }
               while(!st2.isEmpty()){
                   Node temp = st2.pop() ;
                   ans.add(temp.data) ;
                   
                   if(temp.left != null) st1.push(temp.left);
                   if(temp.right != null) st1.push(temp.right);
               }
           }
           
           return ans;
    }
}
