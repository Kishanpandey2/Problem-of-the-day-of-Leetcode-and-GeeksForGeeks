class Solution {
    public int minStoneSum(int[] piles, int k) {
        int sum =0 ;
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : piles)
        pq.add(i) ;
        while(k>0)
        {
            int t = pq.poll() ;
            if(t%2==0)
            t = t/2 ;
            else
             t= t/2+1 ;
             pq.add(t);
             k--;
        }
        while(!pq.isEmpty())
        {
            sum+=pq.poll();
        }
        return sum ;
    }
}

Time Complexity ->  O(n) 
Space Complexity -> O(n) 
