
class Solution{
    static int isPossible(int n, int m, String s){
       int a=0, b=0, c=0, d=0;
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='L'){
               a++;
               if(b!=0)
               b--;
           }
           else if(s.charAt(i)=='R'){
               b++;
               if(a!=0)
               a--;
           }
           else if(s.charAt(i)=='D'){
               c++;
               if(d!=0)
               d--;
           }
           else if(s.charAt(i)=='U'){
               d++;
               if(c!=0)
               c--;
           }
           if(a>=m || b>=m || c>=n || d>=n)
           return 0;
       }
       return 1;
    }
}
