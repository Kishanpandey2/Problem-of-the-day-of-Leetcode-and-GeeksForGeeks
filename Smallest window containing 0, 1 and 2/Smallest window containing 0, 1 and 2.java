
class Solution {
    public int smallestSubstring(String S) {
        int st  = 0 ;
        int i = 0 ;
        int ans = Integer.MAX_VALUE ;
        
        int zero = 0 , one = 0  , two  = 0;
        while(i<S.length()){
            if(S.charAt(i)=='0')
            zero++;
            else if(S.charAt(i)=='1')
            one++;
            else if(S.charAt(i)=='2')
            two++;
            
            if(zero>=1 && one >=1 && two>=1)
            {
                ans = Math.min(ans,i - st+1) ;
                if((i - st +1)>3)
                {
                    if(S.charAt(st)=='0')
            zero--;
            else if(S.charAt(st)=='1')
            one--;
            else if(S.charAt(st)=='2')
            two--;
            
            st++;
                }
                else
                i++;
            }
            else
            i++;
        }
        
        return ans!=Integer.MAX_VALUE ? ans:-1;
    }
};
