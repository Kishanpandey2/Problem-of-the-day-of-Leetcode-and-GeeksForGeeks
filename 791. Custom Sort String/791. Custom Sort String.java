class Solution {
    public String customSortString(String order, String s) {
       int []freq = new int[26] ;

       for(char ch : s.toCharArray())
       freq[ch-'a']++ ;

        StringBuilder sb = new StringBuilder() ;
       for(char ch : order.toCharArray()) 
       {
          while(freq[ch-'a']>0)
          {
              sb.append(ch); 
              freq[ch-'a']--;
          }
       }

       for(int i=0;i<26;i++)
       {
           int f = freq[i] ;
           while(f>0)
           {
               sb.append((char)(i+'a')) ;
               f--;
           }
       }

       return sb.toString() ;
    }
}
