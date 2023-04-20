
class Solution{
    static int ans=0;
    static int ladoos(Node root, int home, int k){
        // Your code goes here
    ans=0;
    solve(root, home,k);
    return ans;
   
    }
    static int solve(Node root, int home, int k)
    {
        if(root==null) return -1;
        if(root.data==home) 
        {
            add(root,k); 
            return k-1;  
        }
        
        int rem = solve(root.right, home, k); 
        if(rem>=0)
        {
            ans+=root.data;  
            add(root.left, rem-1); 
            return rem-1; 
        }
        
         
         rem = solve(root.left, home, k); 
         if(rem>=0)
         {
             ans+=root.data;
             add(root.right, rem-1);
             return rem-1;
         }
        return -1;
        
    }
    static void add(Node n, int dist){
        if( (n==null) || (dist<0) ) return;
        ans += n.data;
         
        add(n.left, dist-1);
        add(n.right, dist-1);
    }
}
