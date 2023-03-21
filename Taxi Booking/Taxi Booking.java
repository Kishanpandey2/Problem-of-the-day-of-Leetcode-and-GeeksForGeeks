class Solution {
    public static int minimumTime(int N, int cur, int[] pos, int[] time) {
        int minTime = Integer.MAX_VALUE ;
        for(int i= 0 ;i<N;i++){
            int temp = Math.abs(cur- pos[i])*time[i] ;
            
            if(temp<minTime)
            minTime  = temp ;
        }
        return minTime ;
    }
}
        
