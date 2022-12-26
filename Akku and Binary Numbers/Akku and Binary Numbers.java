class Solution{
    
    void precompute(){
        // Code Here
    }
    long solve(long L, long R){
        // Code here
        long res = 0 ;
        for(int i = 0;i<63;i++)
        {
            for(int j = i+1;j<63 ;j++)
            {
                for(int k = j+1;k<63;k++)
                {
                    long current_NO = 0;
                    current_NO |= (1L<<i);
                    current_NO |= (1L<<j);
                    current_NO |= (1L<<k);
                    if(current_NO>=L && current_NO<=R)
                    res++;
                }
            }
        }
        return res;
        
    }
    
}
