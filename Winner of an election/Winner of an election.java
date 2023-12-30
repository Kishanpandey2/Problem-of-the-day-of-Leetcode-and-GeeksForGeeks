
class Solution
{
    public static String[] winner(String arr[], int n)
    {
        Map<String,Integer>map = new TreeMap<>() ;
        
        for(String word : arr)
        map.put(word, map.getOrDefault(word,0)+1) ;
        
        String []ans = new String[2] ;
        int vote  = 0 ;
        for(Map.Entry<String,Integer>entry : map.entrySet())
        {
            if(entry.getValue()>vote){
            ans[0] = entry.getKey() ;
            ans[1] = ""+entry.getValue() ;
            vote = entry.getValue() ;
            }
        }
        
        return ans;
    }
}

