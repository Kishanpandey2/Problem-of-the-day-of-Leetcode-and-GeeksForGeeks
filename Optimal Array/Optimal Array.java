  // Brute force solution in O(n^2)

class Solution {
    public long[] optimalArray(int n,int a[])
    {
      
        
        long []ans  = new long[n] ;
        
        for(int i = 0 ;i<n;i++){
            int med = 0 ;
            
            if((i+1)%2==0)
            med = (a[i/2]+a[(i+1)/2])/2 ;
            else
            med = a[i/2] ;
            
            int cur_ans = 0 ;
            
            for(int j = 0 ;j<=i;j++)
            {
                cur_ans += Math.abs(a[j]-med) ;
            }
            
            ans[i] = cur_ans ;
        }
        return ans ;
    }
}
        







// Efficient solution in O(n) ;


class Solution {
    public long[] optimalArray(int n,int a[])
    {
        
        
        long []ans  = new long[n] ;
        int idx = 0 ;
        int s1 = 0 , s2 = 0 ;
        for(int i = 0 ;i<(n+1)/2;i++){
            s1 += a[i];
           
           if(2*i<n)
           {
               s2 += a[2*i] ;
               
               int cur_ans = ((i+1)*a[i]-s1) + (s2-s1) - i*a[i]  ;
               ans[idx++] = cur_ans;
           }
           
           if(2*i+1 < n){
              s2 += a[2*i+1] ;
               
               int cur_ans = ((i+1)*a[i]-s1) + (s2-s1) - (i+1)*a[i]  ;
               ans[idx++] = cur_ans; 
           }
           
        }
        return ans ;
    }
}
        
