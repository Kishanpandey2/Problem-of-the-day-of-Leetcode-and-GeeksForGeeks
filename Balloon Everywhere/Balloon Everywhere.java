
class Solution {
    public int maxInstance(String s) {
         Map<Character,Integer>map = new HashMap<>() ;
         for(char ch : s.toCharArray()){
             map.put(ch,map.getOrDefault(ch,0)+1);
         }
         int ans = Integer.MAX_VALUE   ;
         String str = "balloon" ;
         for(char ch: str.toCharArray() ){
             int temp ;
             if(ch=='l' || ch=='o' )
              temp = map.get(ch)/2 ;
             else
             temp = map.get(ch) ;
             ans  = Math.min(ans,temp) ;
             
         }
         if(ans != Integer.MAX_VALUE)
         return ans ;
         else 
         return 0 ;
    }
}
