class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String>map = new HashMap<>() ;
        Map<String ,Boolean>use = new HashMap<>() ;
        String []totalWords = s.split(" ");
        if(pattern.length()!= totalWords.length)
        return false;
        for(int i = 0 ;i<pattern.length();i++)
        {
            if(map.containsKey(pattern.charAt(i))==false)
            {
                if(use.containsKey(totalWords[i])==true)
                return false ;
                else
                {
                    use.put(totalWords[i],true);
                    map.put(pattern.charAt(i),totalWords[i]);
                }

            }
            else
            {
                String temp = map.get(pattern.charAt(i));
                if(temp.equals(totalWords[i])==false)
                return false;
            }

        }
        return true;
    }
}
