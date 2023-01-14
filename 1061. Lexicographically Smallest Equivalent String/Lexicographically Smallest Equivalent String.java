class Solution {
    int []letter = new int[26] ;
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        for(int i = 0 ;i<26;i++)
        {
            letter[i]= i ;
        }
        for(int i = 0 ;i<s1.length() ;i++)
        {
            unity(s1.charAt(i)-'a',s2.charAt(i)-'a') ;
        }
        StringBuilder res = new StringBuilder() ;
        for(int i =0 ;i<baseStr.length() ;i++)
        {
            res.append((char)((get(baseStr.charAt(i)-'a'))+'a')) ;
        }
        return res.toString();
    }
    public void unity(int x,int y)
    {
        x = get(x) ;
        y = get(y) ;
        if(x<y)
        {
            letter[y]=x ;

        }
        else
        letter[x]= y ;

    }
    public int get(int x)
    {
        if(letter[x]==x)
        return x ;
        else 
        {
            letter[x]= get(letter[x]) ;
            return letter[x] ;
        }
    }
}
