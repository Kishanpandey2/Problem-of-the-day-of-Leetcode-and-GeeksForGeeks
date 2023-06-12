// Brute Force solution 

class Solution{
    public int cutRod(int price[], int n) {
        return help(n,price,0);
    }
    int help(int n, int []price, int index){
        if(index+1>n)
        return 0;
        
        return Math.max(help(n,price,index+1),price[index]+help(n-index-1,price,index));
    }
}


// Efficient solution 

class Solution{
    public int cutRod(int price[], int n) {
        int dp[][] = new int[n+1][n+1];
        for(int []x:dp)
        Arrays.fill(x,-1);
        return help(n,price,0,dp);
    }
    int help(int n, int []price, int index,int [][]dp){
        if(index+1>n)
        return 0;
        if(dp[index+1][n]!=-1)
        return dp[index+1][n];
        return dp[index+1][n]= Math.max(help(n,price,index+1,dp),price[index]+help(n-index-1,price,index,dp));
    }
}
