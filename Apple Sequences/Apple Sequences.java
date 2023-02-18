class Solution{
    public static int appleSequence(int n, int m, String arr){
        int s = 0  ;
        int cnt = 0 ;
        int mx = 0 ;
        char []ch = arr.toCharArray() ;
        for(int i = 0 ;i<n;i++){
            if(ch[i]=='A')
            mx = Math.max(mx,i-s+1) ;
            
            if(ch[i]=='O')
            {
                cnt++ ;
                
                if(cnt>m){
                    while(s<i && ch[s]=='A')
                    s++ ;
                    
                    s++ ;
                }
                mx = Math.max(mx,i-s+1) ;
            }
        }
        return mx ;
        
    }
}
