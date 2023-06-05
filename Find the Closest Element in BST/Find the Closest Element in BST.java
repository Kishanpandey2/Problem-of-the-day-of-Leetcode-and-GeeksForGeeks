// Brute Force solution 
class Solution
{
    static int ans ;
    static int minDiff(Node  root, int K) 
    { 
        ans = Integer.MAX_VALUE ;
        inorder(root,K);
        
         return ans;
    } 
    static void inorder(Node root, int K)
    {
        if(root == null)
        return ;
        inorder(root.left,K) ;
        ans = Math.min(ans,Math.abs(K- root.data)) ;
        inorder(root.right,K);
    }
}

// Efficient Solution 

class Solution
{
    
    static int minDiff(Node  root, int K) 
    { 
       return  help(root,K);
    } 
    static int help(Node root , int K){
        if(root == null)
        return Integer.MAX_VALUE ;
        
        if(root.data == K)
        return 0 ;
        
        if(root.data>K){
            return Math.min(root.data-K,help(root.left,K)) ;
        }
         return Math.min(K- root.data,help(root.right,K)) ;
    }
}

