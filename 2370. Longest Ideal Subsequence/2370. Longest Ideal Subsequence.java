class Solution {
    public int longestIdealString(String s, int k) {
        int []freq = new int[26] ;
        freq[s.charAt(s.length()-1)-'a'] = 1 ;

        
        for(int i = s.length()-2;i>=0;i--){
            int st = Math.max(0,(s.charAt(i)-'a')-k);
            int end = Math.min(25,(s.charAt(i)-'a')+k);
               
                int ans = 0;

            for(int j = st;j<=end;j++)
            ans = Math.max(ans,freq[j]);

            freq[s.charAt(i)-'a']= Math.max(freq[s.charAt(i)-'a'],ans+1);

        }

        int ans = 0;
        for(int i : freq)
        ans = Math.max(ans,i);

        return ans;
    }
}
