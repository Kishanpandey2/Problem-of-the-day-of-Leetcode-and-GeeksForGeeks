
class Solution{
    static String printMinNumberForPattern(String S){
         int cnt = 1 ;
         
         char []ans = new char[S.length()+1] ;
         
         for(int i = 0 ;i<=S.length() ;i++)
         {
             if(i == S.length()  || S.charAt(i)=='I'){
                 for(int j = i-1;j>=-1;j--){
                     ans[j+1] = (char)(cnt+'0') ;
                     cnt++ ;
                     if(j>=0 && S.charAt(j)=='I')break;
                 }
             }
         }
         
         return new String(ans);
    }
}
