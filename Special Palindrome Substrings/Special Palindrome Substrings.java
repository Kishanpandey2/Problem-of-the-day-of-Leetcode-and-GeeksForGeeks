class Solution{
    public  static int specialPalindrome(String a, String b){
       int l1 = a.length(), l2 = b.length();
       if(l1<l2)
       return -1;
       
       int res = Integer.MAX_VALUE;
        char s1[] = a.toCharArray(), s2[] = b.toCharArray();
        for(int i=0 ; i<l1-l2+1 ; i++)
       {
           //1
           char temp[]=(a.substring(0,i)+b+a.substring(i+l2)).toCharArray();
         
            int cost=0;
       //2
            for(int j=i ; j<i+l2 ; j++)
            {
                if(s1[j]!=temp[j])
                    cost++;
            }
             
        //3    
           int is_palin=1;
            for(int j=0 ; j<Math.ceil(l1/2.0) ; j++) // checking palindrome
            { 
    
             if((j<i || j>=i+l2) && temp[j]!=temp[l1-j-1]) // if s2 is in the 1st half 
                    cost++;
                    
             else if( (l1-i-1<j || l1-i-l2-1>=j) && temp[j]!=temp[l1-j-1])     //s2 in 2nd half 
              cost++;
              
              //s2 in mid 
              else if (temp[j]!=temp[l1-j-1])
               {
                   is_palin=0;// not poss to make it palindrome
                    break;
               }
            }
              if(is_palin==1)
                res=Math.min(res,cost);
            
       }
        if(res == Integer.MAX_VALUE){
          return -1;
        }
        return res;
    }
}
