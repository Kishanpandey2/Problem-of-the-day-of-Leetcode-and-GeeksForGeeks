
class Solution {
    
    public boolean countSub(long arr[], long n)
    {
      
        
        for(int i = 0;i<n;i++)
        {
            int left = 2*i+1 ;
            int right = 2*i+2 ;
            
            if(left<n && arr[left]>arr[i])return false ;
            if(right<n && arr[right]>arr[i])return false ;
        
        }
        
        return true ;
        
    }
}
