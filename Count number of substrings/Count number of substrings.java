// Brute Force solution

class Solution
{
    long substrCount (String S, int K) {
       Set<Character>st ;
       int n = S.length() ;
       int ans = 0 ;
       
       for(int i = 0 ;i<n ;i++){
           st = new HashSet<>() ;
           int distinctChar = 0 ;
           
           for(int j = i;j<n;j++){
               char ch = S.charAt(j) ;
               if(!st.contains(ch))
               {
                   st.add(ch) ; distinctChar++ ;
               }
               
               if(distinctChar == K)
               ans++ ;
               if(distinctChar > K)
               break ;
           }
       }
       
       return ans;
    }
}


// Method 2
class Solution
{
    long substrCount (String S, int K) {
        return helper(S,K)-helper(S,K-1);
    }
    
    
    public static long helper(String S,int k){
        
        int[] arr=new int[26];
        long ans=0;
        int diff=0;
        int p=0;
        
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            arr[ch-'a']++;
            
            
            if(arr[ch-'a']==1){
                diff++;                          
                
                  }
            
            if(diff<=k){
            }
            else{
                
                while(diff>k){
                    char ch1= S.charAt(p);
                    
                    arr[ch1-'a']--;
                    p++;
                    if(arr[ch1-'a']==0){
                        
                        
                        diff--;
                    }
                    
                    if(diff<=k){
                        
                    }
                }
            }
            
            ans+=i-p+1;
        }
        return ans;
    }
}
