
// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

class Solution
{
    Set<Node>st  ;
    int printKDistantfromLeaf(Node root, int k)
    {
        st = new HashSet<>() ;
        
        dfs(root,k);
        
        return st.size();
    }
    
    void dfs(Node root, int k){
        if(root == null)return ;
        
        dfs(root.left,k) ;
        
        if(isValid(root,k))
        st.add(root) ;
        
        dfs(root.right,k) ;
    }
    
    boolean isValid(Node root,int k){
        if(root == null)return false ;
        
        if(root.left == null && root.right == null)return k == 0 ;
        
           return  isValid(root.left,k-1)  || isValid(root.right,k-1);
            
    }

}
