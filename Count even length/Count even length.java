class Solution
{public final long m = 1000000007 ;
    public int  compute_value(int n)
    {
        // code here
        
        long res = 0 ;
        long fact_of_n = 1 ;
        for(int i = 1;i<=n;i++)
        fact_of_n =( fact_of_n%m*i%m)%m ;
        long fact_of_r = 1 ;
        long fact_of_n_r = fact_of_n ;
          for(int r=0;r<=n;r++){//O(n)
            long d = (fact_of_r%m * fact_of_n_r%m)%m;
            long v = (fact_of_n%m * power(d,m-2))%m;//O(log10^9)
            res= (res%m + ((v%m*v%m)%m)%m);
            fact_of_r=(fact_of_r%m*(r+1)%m)%m;
            if(n!=r)fact_of_n_r = (fact_of_n_r%m * power((n-r),m-2))%m;
        }
        return (int)res;
    }
   long power(long a,long b){
        if(b==0)return 1;
        long half= power(a,b/2);
        long full = (half%m*half%m)%m;
        if(b%2==1)full = (full%m*a%m)%m;
        return full;
    }

}

Expected Time Complexity: O(n * log(n))
Expected Space Complexity:  O(1)
 
