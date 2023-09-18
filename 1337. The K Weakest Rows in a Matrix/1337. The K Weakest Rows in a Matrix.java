// Method 1 
class Solution {
    class Point implements Comparable<Point>{
        int x,y ;
        Point(int x,int y){
            this.x = x ; this.y = y ;
        }

        public int compareTo(Point p ){
            if(this.x == p.x)return this.y - p.y;
            return this.x - p.x ;
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Point>pq = new PriorityQueue<>()    ;

        int cnt ;
        for(int i = 0 ;i<mat.length ;i++){
            cnt= 0 ;
            for(int j = 0 ;j<mat[0].length;j++ )
            if(mat[i][j] == 1)cnt++ ; 
            else break;

            pq.add(new Point(cnt,i)) ;
        }

        int []ans  = new int[k] ;
        int ind = 0 ;
        while(!pq.isEmpty()){
            Point temp= pq.poll() ;

            ans[ind++] = temp.y ;
            if(ind == k)break;
        }

        return ans;
    }
}



// Method 2 
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int []>pq = new PriorityQueue<>( (a,b) ->  a[0]!=b[0] ? b[0]-a[0] : b[1]-a[1] ) ;

        int cnt ;
        for(int i = 0 ;i<mat.length ;i++){
            cnt = 0 ;
            for(int j = 0 ;j<mat[0].length;j++ )
            if(mat[i][j] == 1)cnt++ ;
            else break;

            pq.add(new int[]{cnt,i}) ;
        }

        int []ans  = new int[k] ;
        
        while(pq.size()>k)pq.poll() ;

        while(k>0){
            int []temp = pq.poll() ;

            ans[--k] = temp[1]; 

        }
        return ans;
    }
}
