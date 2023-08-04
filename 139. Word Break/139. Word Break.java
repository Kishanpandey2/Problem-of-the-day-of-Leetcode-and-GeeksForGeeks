// Brute Force solution using recursion
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        if(wordDict.contains(s)) return true;

        for(int i = 1;i<= s.length();i++)
        {
            String l = s.substring(0,i) ;

            if(wordDict.contains(l) && wordBreak(s.substring(i),wordDict))
            return true;
        }
        return false;
    }
}

// Efficient solution  using Dynamic concept
class Solution {
    Map<String , Boolean>map = new HashMap<>() ;
    public boolean wordBreak(String s, List<String> wordDict) {
        if(wordDict.contains(s)) return true;

        if(map.containsKey(s))
        return map.get(s) ;
        for(int i = 1;i<= s.length();i++)
        {
            String l = s.substring(0,i) ;

            if(wordDict.contains(l) && wordBreak(s.substring(i),wordDict))
           { 
               map.put(s,true);
               return true;
           }
        }
        map.put(s,false);
        return false;
    }
}

