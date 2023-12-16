class Solution 
{ 
    static long countStr(long n)
	{
	   long ans = 1 + n + n + n*(n-1) + n*((n-1)*(n-2))/2 + (n*(n-1))/2 ;
	   
	   return ans;
	}
} 
