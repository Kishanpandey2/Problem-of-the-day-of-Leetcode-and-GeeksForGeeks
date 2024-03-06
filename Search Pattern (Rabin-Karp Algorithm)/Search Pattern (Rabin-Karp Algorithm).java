// Naive solution

class Solution
{
    
    ArrayList<Integer> search(String pattern, String text)
    {
        ArrayList<Integer>al = new ArrayList<>() ;
        
        int i = 0 ;
        while(i<text.length())
        {
            int ind = text.indexOf(pattern,i) ;
            if(ind != -1)
           { al.add(ind+1);
               i = ind+1;
           }
           else break;
        }
        
        return al;
    }
}







// Efiicient solution using Rabin-Karp Algorithm

class Solution
{
    int d = 26 ;
    int q =100001;
    ArrayList<Integer> search(String pat, String txt)
    {
      int h = 1  ;
       ArrayList<Integer> ans = new ArrayList<>();
       int n = txt.length()  ;
       int m = pat.length() ;
       
       for(int i = 1;i<=m-1 ;i++)
         h = (d*h)%q ;
         
         int p = 0 , t = 0 ;
         
         for(int i = 0 ;i<m ;i++)
         {
             p = (p*d+pat.charAt(i))%q ;
             t = (t*d+txt.charAt(i))%q ;
         }
         
         for(int i = 0;i<=n-m;i++)
         {
             if(p==t)
             {
                 boolean flag = true ;
                for(int j = 0 ;j<m;j++){
                     if(pat.charAt(j)!=txt.charAt(i+j))
                     {
                         flag = false;
                         break;
                     }
                     
                 }
                 if(flag)
                 ans.add(i+1);
                 
             }
             if(i<n-m)
             {
                 t = (d*(t-txt.charAt(i)*h)+txt.charAt(i+m))%q ;
                if(t<0)
                t += q ;
             }
         }
         
         return ans;
    }
}
