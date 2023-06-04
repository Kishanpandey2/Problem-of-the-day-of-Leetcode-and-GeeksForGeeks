class Solution
{
   
    String reverseEqn(String S)
    {
        int n = S.length();
         char ch[] = S.toCharArray() ;
       for(int i = 0 ;i<n/2;i++)
       {
           char temp = ch[i] ;
           ch[i] = ch[n-i-1];
           ch[n-i-1] = temp ;
       }
        int prev =0 ;
       for(int i =0 ;i<n;i++)
       {
           if(ch[i] =='-'|| ch[i] =='+'|| ch[i] == '*' || ch[i] == '/')
           {
               int j = i-1 ;
               while(prev<j)
               {
                   char temp = ch[prev] ;
                   ch[prev] = ch[j] ;
                   ch[j] = temp ;
                   j-- ;
                   prev++ ;
               }
               prev = i+1 ;
           }
       }
        int j = n-1 ;
               while(prev<j)
               {
                   char temp = ch[prev] ;
                   ch[prev] = ch[j] ;
                   ch[j] = temp ;
                   j-- ;
                   prev++ ;
               }
                
       String ans = new String(ch);
       return ans ;
    }
}
