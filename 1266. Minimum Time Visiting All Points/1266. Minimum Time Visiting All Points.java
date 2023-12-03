class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0 ;
        
        for(int i = 1 ;i<points.length;i++){
            int nx = Math.abs(points[i][0]-points[i-1][0]) ;
            int ny = Math.abs(points[i][1]-points[i-1][1]) ;

            ans += Math.max(nx,ny) ;
        }

        return ans;
    }
}
