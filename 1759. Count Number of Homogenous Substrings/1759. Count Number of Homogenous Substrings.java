class Solution {
    public int countHomogenous(String s) {
        int mod = 1000000007;
        int n = s.length() ;
        long ans = 0 ;

        for(int i = 0 ;i<n;){
           long cnt =  0;
         char  ch = s.charAt(i);
            while(i<n && s.charAt(i)==ch){
               cnt++;
                i++;
            }
            
            ans += (cnt*(cnt+1)/2)%mod ;
        }

        return  (int)(ans%mod);
    }
}
