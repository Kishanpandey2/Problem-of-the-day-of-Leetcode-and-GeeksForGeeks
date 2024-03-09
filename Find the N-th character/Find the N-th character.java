
class Solution
{
    public char nthCharacter(String s, int r, int n)
    {
        List<Character>l = new LinkedList<>() ;
        
        for(char ch : s.toCharArray())
        l.add(ch) ;
        
        for(int k = 0;k<r;k++)
        {
            for(int i = 0 ;i<l.size() ;i= i+2)
            {
                if(l.get(i)=='1')
                l.add(i+1,'0');
                else
                l.add(i+1,'1');
                
                if(i>n)break;
            }
        }
        return l.get(n);
    }
}
