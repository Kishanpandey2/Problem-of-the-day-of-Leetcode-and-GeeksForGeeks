class Solution {
    Long maxTripletProduct(Long arr[], int n)
    {
       PriorityQueue<Long>pq1  = new PriorityQueue<>() ;
        PriorityQueue<Long>pq2  = new PriorityQueue<>(Collections.reverseOrder()) ;
        
        for(long i : arr){
            pq1.add(i) ;
            pq2.add(i) ;
        }
        
        long min1 = pq1.poll() ;
        long min2 = pq1.poll() ;
        long min3 = pq1.poll() ;
        
        long mx1 = pq2.poll() ;
        long mx2 = pq2.poll() ;
        long mx3 = pq2.poll() ;
        
        long ans = Math.max(mx1*min1*min2,Math.max(mx1*mx2*mx3,min1*min2*min3)) ; 
        return ans ;
    }
}
