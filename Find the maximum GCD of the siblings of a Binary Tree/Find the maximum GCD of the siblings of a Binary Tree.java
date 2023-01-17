class Solution {
    int  gcd(int a ,int b)
    {
        if(b==0)
        return a ;
        return gcd(b,a%b) ;
    }
    private int greatestCommanDivisor, ans;
    int maxGCD(Node root) {
        // code here 
        greatestCommanDivisor = 0 ;
        ans = 0 ;
        dfs(root) ;
        return ans;
        
    }
    private int  dfs(Node root )
    {
        if(root == null)
        return 0;
        int l = dfs(root.left) ;
        int r = dfs(root.right) ;
        
        if(l!=0 && r!=0)
        {
            int g= gcd(l,r) ;
            if(g>greatestCommanDivisor)
            {
                ans = root.data ;
                greatestCommanDivisor = g ;
            }
            else if(g==greatestCommanDivisor && root.data>ans)
            {
                ans= root.data ;
            }
        }
        return root.data;
    }
    
}


Expected Time Complexity: O(|Number of nodes|) .
Expected Auxiliary Space: O(1) .
