class Solution {
    public int furthestBuilding(int[] h, int b, int l) {
        PriorityQueue<Integer>pq = new PriorityQueue<>() ;

        for(int i = 0 ;i<h.length-1;i++)
        {
            int dif = h[i+1]-h[i] ;

            if(dif>0)
            pq.add(dif) ;

            if(pq.size()>l)
            b -=  pq.poll() ;

            if(b<0)return i ;
        }

        return h.length-1;
    }
}
