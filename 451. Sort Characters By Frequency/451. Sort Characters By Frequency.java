class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>() ;
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1)  ;
        }
        List<Character>[]b= new List[s.length()+1] ;
        for(Character key: map.keySet())
        {
            int freq = map.get(key) ;
         if(b[freq] == null)
             b[freq ]=new ArrayList<>() ;
           
            b[freq ].add(key) ;
        }
        StringBuilder sb = new StringBuilder() ;
        for(int i = b.length-1;i>=0;i--)
        {
            if(b[i]!=null)
            {
                for(char c:b[i])
                {
                    for(int j = 0 ;j<map.get(c) ;j++)
                        sb.append(c);
                }
            }
        } 
        return sb.toString();
    }
   
}
