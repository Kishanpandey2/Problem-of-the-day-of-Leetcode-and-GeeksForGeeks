
class Solution {
    String removeDups(String str) {
        int []freq  = new int[26] ;
        
        StringBuilder sb = new StringBuilder() ;
        
        for(char ch: str.toCharArray()) {
            if(freq[ch-'a']==0)
            {
                sb.append(ch);
            }
            
            freq[ch-'a']++;
        }
        return sb.toString();
    }
}
