// Brute force solution 

class Solution{
    int mod = 1000000007 ;
	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    
	    return help(0,arr,sum) ;
	} 
	private int help(int pos,int []arr,int sum){
	    if(sum<0)return 0 ;
	    
	    if(pos ==arr.length)
	    return (sum==0?1:0) ;
	    
	    return (help(pos+1,arr,sum)%mod + help(pos+1,arr,sum-arr[pos])%mod)%mod;
	}
}

// Using Memorization

class Solution{
    int mod = 1000000007 ;
	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    int dp[][] = new int[n+1][sum+1] ;
	    
	    for(int i[]: dp){
	        Arrays.fill(i,-1);
	    }
	    
	    return help(0,arr,sum,dp) ;
	} 
	private int help(int pos,int []arr,int sum,int dp[][]){
	    if(sum<0)return 0 ;
	    
	    if(pos ==arr.length)
	    return (sum==0?1:0) ;
	    
	    if(dp[pos][sum]!= -1)
	    return dp[pos][sum];
	    
	    dp[pos][sum] =  (help(pos+1,arr,sum,dp)%mod + help(pos+1,arr,sum-arr[pos],dp)%mod)%mod;
	    
	    return dp[pos][sum] ;
	}
}
