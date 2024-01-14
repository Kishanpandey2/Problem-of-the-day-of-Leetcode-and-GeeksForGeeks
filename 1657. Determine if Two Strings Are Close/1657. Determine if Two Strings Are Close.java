class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length())return false;

            Map<Integer,Integer>map = new HashMap<>();
        
        int []word1Cnt = new int[26] ;
        int []word2Cnt = new int[26] ;

        for(char ch : word1.toCharArray())
        word1Cnt[ch-'a']++ ;

        for(char ch : word2.toCharArray())
        word2Cnt[ch-'a']++ ;

        for(int i = 0 ;i<26;i++)
        if((word1Cnt[i]==0 && word2Cnt[i]!=0)||(word1Cnt[i]!=0 && word2Cnt[i]==0))
        return false;

        for(int i : word1Cnt)
        if(i>0)
        map.put(i,map.getOrDefault(i,0)+1) ;

        for(Integer i : word2Cnt)
        {
            if(i>0){
                if(!map.containsKey(i))return false;
                
                if(map.get(i)==1)
                map.remove(i)  ;
                else
                map.put(i,map.get(i)-1);
            }
        }

    

        return true ;
    }
}
