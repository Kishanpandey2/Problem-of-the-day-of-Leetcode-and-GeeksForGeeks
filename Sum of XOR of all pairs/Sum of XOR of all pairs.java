// Brute Force solution

class Solution{
   
    public long sumXOR (int arr[], int n) {
        long ans = 0 ;
        
        for(int i = 0 ;i<n-1 ;i++){
            for(int j = i+1;j<n;j++)
            ans += (arr[i]^arr[j]) ;
        }
        
        
        return ans;
    }
    
    
}


// Efficient solution

class Solution{
   
    public long sumXOR (int arr[], int n) {
        long ans = 0 ;
        
        for(int i = 0 ;i<31;i++){
            long cntZero = 0 , cntOne = 0 ;
            
            for(int j = 0 ;j<n;j++)
            {
                if( (arr[j]& ( 1<<i)) != 0 )
                cntOne++ ;
                else
                cntZero++ ;
            }
            long pair = (cntZero * cntOne)  ;
            
            ans += (1<<i)* pair ;
        }
        
        return ans;
    }
    
    
}



