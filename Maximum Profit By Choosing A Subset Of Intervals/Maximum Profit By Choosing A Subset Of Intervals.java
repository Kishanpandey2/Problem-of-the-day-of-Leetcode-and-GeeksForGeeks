class Solution {
    public static int maximum_profit(int n, int[][] arr) {
        // code here
        Arrays.sort(arr,(x,y)->{
           if(x[0]!=y[0]) return x[0]-y[0];
           return x[1]-y[1];
        });
        int[]dp=new int[n];
        return solve(0,arr,n,dp);
    }
    static int solve(int ind,int[][]arr,int n,int[]dp){
        if(ind>=n)return 0;
        if(dp[ind]!=0)return dp[ind];
        int not_sel=solve(ind+1,arr,n,dp);
        int nextind = findNext(ind+1,arr[ind][1],arr,n);
        int sel = arr[ind][2] + solve(nextind,arr,n,dp);
        return dp[ind]=Math.max(sel,not_sel);
    }
    static int findNext(int i,int prevEnd,int[][]arr,int n){
        while(i<n){
            if(arr[i][0]>=prevEnd){
                break;
            }else{
                i++;
            }
        }
        return i;
    }
}
