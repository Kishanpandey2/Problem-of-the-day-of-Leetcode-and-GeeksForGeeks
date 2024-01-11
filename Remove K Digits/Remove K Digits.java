

class Solution {
    public String removeKdigits(String S, int k) {
        
        Stack<Character>st = new Stack<>() ;
        
        for(char ch : S.toCharArray())
        {
            while(st.size()>0 && k>0 && st.peek() >ch)
            {
                st.pop(); k-- ;
            }
            
            st.push(ch) ;
        }
        
        while(k>0)
        {
            st.pop();
            k--;
        }
        char no[] = new char[st.size()] ;
        
        int len = no.length-1 ;
        while(len>=0)
        no[len-- ]= st.pop();
        
        int ind = 0 ;
        
        StringBuilder sb  = new StringBuilder();
        
        while(ind<no.length && no[ind]=='0')
        {
            ind++;
        }
        
        for(int i = ind ;i<no.length;i++)
        sb.append(no[i]) ;
        
        if(sb.length() ==0)sb.append(0) ;
        
        return sb.toString();
    }
}
