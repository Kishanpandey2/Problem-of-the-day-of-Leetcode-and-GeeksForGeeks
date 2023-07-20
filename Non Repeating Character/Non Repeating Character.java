class Solution
{
   
    static char nonrepeatingCharacter(String S)
    {
        Map<Character,Integer>map = new HashMap<>() ;
       for(char ch : S.toCharArray())
       {
           map.put(ch,map.getOrDefault(ch,0)+1) ;
       }
       
       for(int i  = 0;i<S.length() ;i++)
       {
           if(map.get(S.charAt(i))==1)
           return S.charAt(i) ;
       }
       return '$' ;
    }
}

