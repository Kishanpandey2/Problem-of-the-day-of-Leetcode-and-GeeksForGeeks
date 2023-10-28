// Brute Force solution

class Solution
{
    public int is_bleak(int n)
    {
        for(int i =1 ;i<=n;i++)
        {
            if((i+countSetBit(i))==n)return 0;
        }
        return 1;
    }
    
    public int countSetBit(int n){
        int cnt= 0 ;
        
        while(n>0){
            n = n&(n-1) ;
            cnt++ ;
        }
        
        return cnt ;
    }
}



// Efficient solution

class Solution
{
    public int is_bleak(int n)
    {
        for(int i =n - 30 ;i<=n;i++)
        {
            if((i+countSetBit(i))==n)return 0;
        }
        return 1;
    }
    
    public int countSetBit(int n){
        int cnt= 0 ;
        
        while(n>0){
            n = n&(n-1) ;
            cnt++ ;
        }
        
        return cnt ;
    }
}
