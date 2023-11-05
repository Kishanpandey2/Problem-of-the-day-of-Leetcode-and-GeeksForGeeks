
class Solution {
    class Pair implements Comparable<Pair>
    {
        int no , cnt  ;
        
        Pair(int no,int cnt){
            this.no = no ;
            this.cnt = cnt ;
        }
        
        public int compareTo(Pair p){
            if(this.cnt == p.cnt)
        return     p.no - this.no ;
            return p.cnt - this.cnt ;
        }
    }
    public int[] topK(int[] nums, int k) {
         Map<Integer,Integer>map = new HashMap<>() ;
         PriorityQueue<Pair>pq = new PriorityQueue<>() ;
         for(int i : nums)
         map.put(i,map.getOrDefault(i,0)+1) ;
         
         Set<Integer>ans = map.keySet();
         for(int i : ans){
           pq.add(new Pair(i,map.get(i))) ;
          
         }
         
         int []res = new int[k] ;
         
         int i = 0 ;
         while(i<k)
         {
             res[i++] = pq.poll().no ;
         }
         
         return res;
    }
}
