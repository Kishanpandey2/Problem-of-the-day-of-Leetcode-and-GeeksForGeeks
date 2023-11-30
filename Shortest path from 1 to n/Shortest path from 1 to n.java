
class Solution{
    public int minStep(int n)
    {
        int res =  0 ;
        
        while(n>=3)
        {
            res += n%3 + 1 ;
            n /=3 ;
        }
        
        return res+(n-1);
    }
}
