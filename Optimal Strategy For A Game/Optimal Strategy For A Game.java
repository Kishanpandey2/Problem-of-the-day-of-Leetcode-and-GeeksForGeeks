
class solve
{
    
    static long countMaximum(int n, int arr[])
    {
        long memo[][] = new long[n+1][n+1];
        
        for(long x[] :memo)
        Arrays.fill(x,-2);
        
    return help(0,n-1,arr,memo);
    }
    static long help(int i,int j,int []arr,long [][]memo){
        if(i>j)return 0 ;
        
        if(i == j)return arr[i] ;
        
        if(memo[i][j]!= -2)
        return memo[i][j];
        
        long  x = arr[i] + Math.min( help(i+2,j,arr,memo), help(i+1,j-1,arr,memo));
        long  y = arr[j] + Math.min( help(i,j-2,arr,memo), help(i+1,j-1,arr,memo));
        
        
        return memo[i][j] = Math.max(x,y);
    }
}
