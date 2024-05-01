class Solution {
    public String reversePrefix(String word, char ch) {
        int ind = word.indexOf(ch) ;
        if(ind == -1)
        {
            return word;
        }
        
      StringBuilder sb = new StringBuilder() ;

      for(int  i = 0 ;i<=ind;i++)
      sb.append(word.charAt(i));

      sb.reverse() ;
      sb.append(word.substring(ind+1));
        return  sb.toString() ;
    }

   
}
