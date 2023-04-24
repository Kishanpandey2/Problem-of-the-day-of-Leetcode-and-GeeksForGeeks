class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder()) ;
        for(int i :stones)
        pq.offer(i) ;

        while(pq.size()>1){
            int x = pq.poll() ;
            int y = pq.poll();
            if(x==y)
            continue ;
            else
            {
                int dif = x-y;
                pq.offer(dif);
            }
        }
        if(pq.size()==0)
        return 0;
        return pq.poll();
    }
}
