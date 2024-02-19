class Solution{
    static int minValue(String s, int k){
        Map<Character,Integer>map = new HashMap<>() ;
        
        for(char ch : s.toCharArray())
        map.put(ch,map.getOrDefault(ch,0)+1) ;
        
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder() ) ;
        
        for(Integer i : map.values())
        pq.add(i) ;
        
        while(!pq.isEmpty() && k>0)
        {
            int no = pq.poll()  - 1;
            pq.add(no) ;
            k--;
        }
        
        long sum = 0 ;
        
        while(!pq.isEmpty())
        {
            int no  = pq.poll() ;
            sum += (no*no) ;
        }
        
        return (int)sum;
    }
}
