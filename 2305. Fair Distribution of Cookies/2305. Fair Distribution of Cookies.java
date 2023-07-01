class Solution {
    int result = Integer.MAX_VALUE ;
    int max = 0 ;
    void solve(int idx, int []cookies ,int []ar, int k)
    {
        if(idx>=cookies.length)
        {
            max =  0;
             for(int i:ar)
             max = Math.max(max,i);
            result = Math.min(result,max) ;
            return;
        }
            int cookie = cookies[idx];
        for(int i = 0 ;i<k;i++)
        { 
            ar[i] += cookie;
            
            solve(idx+1,cookies,ar,k);
             ar[i] -= cookie;
        }
    }
    public int distributeCookies(int[] cookies, int k) {
         
        int []ar = new int[k] ;
        solve(0,cookies,ar,k);
        return result ;
    }
}
