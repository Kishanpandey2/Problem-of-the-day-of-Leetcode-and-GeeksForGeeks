class Solution {
    public static int setBit(int n)
    {
        int c = 0 ;
        while(n!=0)
        {
            c++;
            n = n&(n-1) ;
        }
        return c ;
    }
    public static int minVal(int a, int b) {
        // code here
        int bita =setBit(a) ;
        int bitb = setBit(b) ;
        if(bita==bitb)
        return a ;
       int res=0 ;
       for(int i = 0 ;i<31;i++)
       {
           int mask = 1<<i ;
           int set = mask&a ;
           if(set==0 && bita < bitb)
           {
               res|=mask ;
               bitb--;
           }
            else if(set!=0 && bita > bitb)
            bita--;
           else
           res|=set ;
       }
       return res ;
    }
}

 
Expected Time Complexity : O(log MAX(A,B))
Expected Auxiliary Space : O(1)
