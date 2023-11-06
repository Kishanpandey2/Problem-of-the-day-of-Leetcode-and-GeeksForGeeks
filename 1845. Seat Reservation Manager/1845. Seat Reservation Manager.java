class SeatManager {
    PriorityQueue<Integer>pq  ;
    public SeatManager(int n) {
        pq = new PriorityQueue<>() ;

        for(int i = 1;i<=n;i++)
        pq.add(i) ;
    }
    
    public int reserve() {
        if(pq.size()>0)return pq.poll() ;
        
        return -1;
    }
    
    public void unreserve(int seatNumber) {
        pq.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
