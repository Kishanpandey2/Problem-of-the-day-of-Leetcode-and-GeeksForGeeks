class Solution {
    public int[] sortArray(int[] nums) {
     PriorityQueue<Integer>pq = new PriorityQueue<>() ;
     for(int i:nums)
     pq.add(i) ;

     int []ans = new int[nums.length] ;
        int c = 0 ;
     while(!pq.isEmpty())
      ans[c++] = pq.poll();

      return ans ;
    }
}
