
class Solution {
    static long maxDiamonds(int[] A, int N, int K) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder()) ;
        for(int i :A)
        pq.offer(i) ;
        
        long ans = 0 ;
        for(int i = 0 ;i<K;i++){
            int no = pq.poll() ;
            ans += no ;
            pq.offer(no/2) ;
        }
        return ans;
    }
};
