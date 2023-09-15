class Solution {
    public int minCostConnectPoints(int[][] points) {
        PriorityQueue<int []>pq = new PriorityQueue<>((a,b) -> (a[2]-b[2])) ;
        int cost =  0 ;
        Set<Integer>vis = new HashSet<>() ;

        pq.offer(new int[]{0,0,0}) ;

        int length = points.length ;
        while(!pq.isEmpty() && vis.size()<length){
            int []temp = pq.poll()  ;
            int curCost = temp[2] ;
            int end = temp[1] ;

            if(vis.contains(end))continue ;

            cost += curCost ;
            vis.add(end) ;

            for(int i = 0 ;i<length;i++){

                if(!vis.contains(i)){
                    pq.offer(new int[]{end,i,distance(points,end,i)}) ;
                }
            }
        }

        return cost ;
    }

    private int distance(int [][]points,int i,int j){
        return Math.abs( points[i][0]-points[j][0])+Math.abs( points[i][1]-points[j][1]) ;
    }
}
