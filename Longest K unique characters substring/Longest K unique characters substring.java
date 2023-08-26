
class Solution {
    public int longestkSubstr(String s, int k) {
      Map<Character,Integer>map = new HashMap<>() ;
      int i = 0 , j = 0 ,cnt = 0 ;
      int ans = -1;
      int n = s.length();
      while(j<n)
      {
           
          while(j<n)
          {
              char ch = s.charAt(j);
              if(!map.containsKey(ch) || map.get(ch)==0)
              cnt++;
              
              map.put(ch,map.getOrDefault(ch,0)+1);
              
              if(cnt>k)break;
              j++;
          }
          
          if(cnt>=k)
          ans = Math.max(ans,j-i);
          if(j==n) break;
          
          while(i<n)
          {
              char ch = s.charAt(i);
              if(map.get(ch)==1)
              cnt--;
              
              map.put(ch,map.get(ch)-1);
              
              if(cnt == k)break;
              i++;
          }
          i++; j++;
      }
      
      
      
      return ans;
    }
}
