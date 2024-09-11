class Solution {
  
    public long minCost(long[] arr) {
        if(arr.length == 1)return 0;
      
        
        PriorityQueue<Long>pq = new PriorityQueue<>() ;
        
        
        long ans = 0 ;
        
        for(long n : arr)
        pq.add(n);
        
        while(!pq.isEmpty()){
            long a = pq.poll();
           
            long b = pq.poll();
            
            ans += (a+b);
            if(pq.isEmpty())break;
            pq.add(a+b);
        }
        
        return ans;
        
    }
}
