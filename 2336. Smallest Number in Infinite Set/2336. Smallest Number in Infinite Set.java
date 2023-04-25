class SmallestInfiniteSet {
PriorityQueue<Integer>pq = null ;
Set<Integer>st  = null ;
    public SmallestInfiniteSet() {
        pq  = new PriorityQueue<>(1000) ;
        st =  new HashSet<>(1000) ;
        for(int i = 1 ;i<=1000;i++)
        {
            pq.offer(i) ;
            st.add(i); 
        }
    }
    
    public int popSmallest() {
        int x  = pq.poll();
        st.remove(x) ;
        return x ;
    }
    
    public void addBack(int num) {
        if(!st.contains(num))
        {
                pq.offer(num) ;
                st.add(num);
        }
    }
}
