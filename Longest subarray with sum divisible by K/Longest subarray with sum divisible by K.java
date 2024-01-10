class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        long sum = 0 ;
        
        Map<Integer,Integer>map = new HashMap<>() ;
        
        map.put(0,-1) ;
        int ans  = 0 ;
        
        for(int i =0 ;i<n;i++)
        {
            sum += a[i] ;
            
            int rem = (int)(sum%k);
            if(rem<0)
            rem+=k ;
            if(map.containsKey(rem))
            {
                ans = Math.max(ans,i-map.get(rem)) ;

            }
            else
            map.put(rem,i);
            
        }
        
        return ans;
       
    }
 
}
