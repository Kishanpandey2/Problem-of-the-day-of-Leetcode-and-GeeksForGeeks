class Solution {
    public boolean canCross(int[] stones) {
     Map<Integer,HashSet<Integer>>map = new HashMap<>() ;
     for(int stone : stones)
     map.put(stone,new HashSet<>()) ;

     map.get(stones[0]).add(1) ;

     for(int i = 0 ;i<stones.length ;i++)
     {
         int curStone = stones[i] ;
         HashSet<Integer>jumps = map.get(curStone);

         for(int jump : jumps){
             int pos = curStone+jump ;
             if(pos == stones[stones.length-1])return true ;

             if(map.containsKey(pos))
             {
                 if(jump-1>0)
                 map.get(pos).add(jump-1);
                 map.get(pos).add(jump);
                 map.get(pos).add(jump+1);
             }
         }
     }   

     return false;
    }
}
