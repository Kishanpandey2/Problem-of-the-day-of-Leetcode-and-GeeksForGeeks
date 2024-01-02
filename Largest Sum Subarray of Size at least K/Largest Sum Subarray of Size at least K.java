

class Solution {
    
    public long maxSumWithK(long a[], long n, long k)
    {
        long ans = Long.MIN_VALUE ;
        
        long []maxSum = new long[(int)n] ;
        
        long curSum = a[0] ;
        maxSum[0] = curSum ;
        
        for(int i =1;i<n;i++)
        {
            if(curSum>0)
            curSum+=a[i] ;
            else
            curSum = a[i] ;
            
            maxSum[i] = curSum ;
            
        }
        
        long exactK = 0l ;
        for(int i  = 0;i<k;i++)
        exactK += a[i] ;
        
        if(exactK>ans)
        ans = exactK ;
        
        long moreThanK = 0 ;
        
        for(int i =(int) k;i<n;i++){
            exactK =exactK+ a[i]-a[i-(int)k] ;
             if(exactK>ans)
        ans = exactK ;
        
        moreThanK  = exactK + maxSum[i-(int)k] ;
         if(moreThanK>ans)
        ans = moreThanK ;
        }
        return ans;
    }
}
