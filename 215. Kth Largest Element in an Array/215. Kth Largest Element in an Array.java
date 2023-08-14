class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder()) ;
        
        for(int i : nums)
        pq.add(i);

        int ans =  0 ;
        
        while(k-- >0)
        {
           
           ans =  pq.poll() ;
             
        }
        return ans;
    }
}
