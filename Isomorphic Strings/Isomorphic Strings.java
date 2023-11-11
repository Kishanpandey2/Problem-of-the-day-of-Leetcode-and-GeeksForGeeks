
class Solution
{
   
    public static boolean areIsomorphic(String str1,String str2)
    {
        Map<Character,Character>map = new HashMap<>();
         Map<Character,Integer>vis = new HashMap<>();
        
        int n1=str1.length() , n2 = str2.length() ;
        if(n1!=n2)return false;
        
        for(int i = 0 ;i<n1;i++){
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            
            if(!map.containsKey(c1)){
                if(!vis.containsKey(c2))
                {
                    map.put(c1,c2) ;
                    vis.put(c2,1) ;
                }
                else if(vis.get(c2)==1)
                return false;
            }
            else if(map.get(c1)!=c2)return false;
        }
        
        return true;
    }
}
