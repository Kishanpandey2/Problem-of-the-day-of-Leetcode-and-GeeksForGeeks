class Solution {
    public int countCharacters(String[] words, String chars) {
       int []charCnt = new int[26] ;
        for(char ch : chars.toCharArray())
        charCnt[ch-'a']++ ;

        int ans = 0 ;
        for(String str : words)
        {
            int []temp = Arrays.copyOf(charCnt, charCnt.length)  ;
           int cnt = 0 ;

           for(char ch : str.toCharArray())
            {
                if(temp[ch-'a']>0)
               { cnt++ ;

                temp[ch-'a']-- ;
               }
            }
            if(cnt == str.length() )
            ans += str.length() ;
        }

        return ans;
    }
}
