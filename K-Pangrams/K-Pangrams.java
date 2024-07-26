class Solution {
    boolean kPangram(String str, int k) {
        int cnt=0  ;
        
        int []freq = new int[26];
        int length = 0 ;
        
        for(char ch : str.toCharArray())
        {
            if(!Character.isLetter(ch))
            continue;
            
            if(freq[ch-'a']==0)
            {
                freq[ch-'a']++;
                cnt++;
            }
            length++;
        }
        
        if(length < 26)return false;
        
        return (k+cnt) >=26 ;
     }
}
