
class Solution
{
    public static int posOfRightMostDiffBit(int m, int n)
    {
            
        if(n == m)return -1 ;
        
        int ans = 0 ;
        
        while(n>0 || m>0){
            if(n>0 && m >0)
            {
                if((n&1)==(m&1))ans++ ;
                else 
                return (ans+1) ;
                
                n>>=1 ;
                m>>=1 ;
            }
            else if(n>0){
                if((n&1)==1)return (ans+1);
                else 
                ans++;
                
                n>>=1 ;
            }
            else if(m>0)
            {
                if((m&1)==1)return (ans+1);
                else ans++;
                
                m>>=1;
            }
        }
        
        return 0;
            
    }
}


