
class Solution
{
    ArrayList<String> ans = null;
    public ArrayList<String> permutation(String S)
    {
        ans = new ArrayList<>() ;
        
        help(S.toCharArray(),0,S.length()-1) ;
        Collections.sort(ans);
        return ans;
    }
    private void help(char ch[], int l,int r){
        if(l== r)
        {ans.add(new String(ch)) ;
        return ;
        }
        
        for(int i = l;i<=r;i++)
        {
            swap(ch,l,i) ;
            help(ch,l+1,r);
            swap(ch,l,i) ;
        }
    }
    void swap(char ch[],int i ,int j)
    {
        char t = ch[i] ;
        ch[i] = ch[j] ;
        ch[j] = t;
    }
	   
}
