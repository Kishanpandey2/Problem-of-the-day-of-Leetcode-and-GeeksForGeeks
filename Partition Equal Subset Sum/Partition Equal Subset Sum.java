
class Solution{
    static int equalPartition(int N, int arr[])
    {
        int sum = 0 ;
        for(int i : arr)sum +=i ;
        
        if(sum%2!= 0)return 0 ;
        
        int targetSum  = sum / 2 ;
        
        boolean [][]dp = new boolean[N+1][targetSum+1] ;
         return (help(0,arr,targetSum,dp)?1:0) ;
    
    }
    private static boolean help(int pos,int []arr,int sum, boolean [][]dp){
	    if(sum<0)return false ;
	    
	    if(pos ==arr.length)
	    return  sum ==  0  ;
	    
	    if(dp[pos][sum])
	    return dp[pos][sum];
	    
	    return dp[pos][sum] =  (help(pos+1,arr,sum-arr[pos],dp)|| help(pos+1,arr,sum,dp));
	   
	    
	}
}
