class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int []freq = new int[26];

        for(char ch : allowed.toCharArray())
       freq[ch-'a']++;

        int ans = 0 ;

        for(String str : words){
            boolean flag = true;
               for(char ch : str.toCharArray())
               {
                    if(freq[ch-'a'] == 0 )
                    {
                        flag = false;
                        break;
                    }
               }

               if(flag)
               ans++;
        }

        return ans;
    }
}
