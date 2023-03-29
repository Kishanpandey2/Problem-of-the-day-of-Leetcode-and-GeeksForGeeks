class Solution 
{ 
    int countSubstring(String S) 
    { 
        int cnt  ;
        int ans  = 0  ;
        for(int i = 0 ;i<S.length() ;i++){
            cnt = 0 ;
            for(int j = i ;j<S.length() ;j++){
                char ch = S.charAt(j) ;
                if(ch>= 'a' && ch<='z')
               cnt++ ;
               else
               cnt--;
                
                if(cnt == 0 )
                ans++;
            }
        }
        return ans ;
    }
} 
