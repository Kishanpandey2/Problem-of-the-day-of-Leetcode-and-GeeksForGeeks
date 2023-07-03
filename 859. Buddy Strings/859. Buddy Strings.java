class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(  s.length() != goal.length())
        return false;
        if(s.equals(goal))
        {
            Set<Character>st = new HashSet<>() ;
            for(char ch : s.toCharArray())
           { if(st.contains(ch))
            return true;
            st.add(ch);
           }
            return false;
        }
    else
    {
        List<Integer>l = new ArrayList<>() ;
        for(int i =0  ;i<s.length() ;i++)
        {
            if(s.charAt(i)!=goal.charAt(i))
            l.add(i);
        }  return l.size() ==2 && s.charAt(l.get(0))== goal.charAt(l.get(1)) && s.charAt(l.get(1))== goal.charAt(l.get(0));
    }
  
    
    }
}
