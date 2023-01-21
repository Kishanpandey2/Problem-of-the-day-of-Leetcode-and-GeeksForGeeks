class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String > ans = new ArrayList<>() ;
        solve(s,0,0,"",ans) ;
        return ans ;
    }
    private  void solve(String s, int i, int partition , String temp , List<String > ans ){
        if(i==s.length() || partition == 4 ){
            if(i==s.length() && partition == 4)
            ans.add(temp.substring(0,temp.length()-1)) ;
              return  ;
        }
        solve(s,i+1,partition+1,temp+s.charAt(i)+".",ans) ;
        if(i+2<=s.length() && isValid(s.substring(i,i+2))) 
         solve(s,i+2,partition+1,temp+s.substring(i,i+2)+".",ans) ;
          if(i+3<=s.length() && isValid(s.substring(i,i+3))) 
         solve(s,i+3,partition+1,temp+s.substring(i,i+3)+".",ans) ;
    }
    public boolean isValid(String s ){
        if(s.charAt(0)=='0')
        return false ;
        int t = Integer.parseInt(s) ;
        return t<=255 ;
    }
}
