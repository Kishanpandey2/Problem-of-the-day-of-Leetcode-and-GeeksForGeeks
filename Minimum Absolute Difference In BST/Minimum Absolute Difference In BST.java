// method - 1

//User function Template for Java

/*The Node structure is defined as
struct Node {
    int data;
    Node *left;
    Node *right;

};
*/
class Solution
{
    
    ArrayList<Integer>al ;
    int absolute_diff(Node root)
    {
       al = new ArrayList<>() ;
       preOrder(root);
       
       int min = Integer.MAX_VALUE;
       
       for(int i= 0;i<al.size()-1;i++)
       min = Math.min(min, al.get(i+1)-al.get(i)  ) ;
       
       return min;
    }
    
    void preOrder(Node root)
    {
        if(root == null)
        {
            return ;
        }
         preOrder(root.left);
        al.add(root.data) ;
       
        preOrder(root.right);
    }
    
}






// Method - 2  with  better space than method - 1
class Solution
{
    
    int res;
    int prev;
    int absolute_diff(Node root)
    {
       
        res = Integer.MAX_VALUE;
        prev = Integer.MAX_VALUE;
        
       preOrder(root);
       
      return res;
    }
    
    void preOrder(Node root)
    {
        if(root == null)
        {
            return ;
        }
         preOrder(root.left);
        
        if(prev != Integer.MAX_VALUE)
        res = Math.min(res,root.data- prev);
        
        prev = root.data;
       
        preOrder(root.right);
    }
    
}
