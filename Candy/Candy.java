
class Solution {
    static int minCandy(int N, int ratings[]) {
        int []relativeLeft = new int[N] ;
        int []relativeRight = new int[N] ;
         
         int ans  = 0 ;
         Arrays.fill(relativeLeft,1);
         Arrays.fill(relativeRight,1);
         
         for(int i = 1 ;i<N;i++)
         {
             if(ratings[i]>ratings[i-1])
             relativeLeft[i] = relativeLeft[i-1]+1 ;
         }
         
         for(int i = N-2;i>=0 ;i--){
             if(ratings[i]>ratings[i+1])
             relativeRight[i] = relativeRight[i+1]+1 ;
         }
         
         for(int i  = 0 ;i<N;i++){
             ans += Math.max(relativeRight[i],relativeLeft[i]) ;
         }
         
         
         return ans ;
    }
}
