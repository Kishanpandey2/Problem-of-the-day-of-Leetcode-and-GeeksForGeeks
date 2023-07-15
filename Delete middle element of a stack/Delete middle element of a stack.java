
class Solution
{
    
    public void deleteMid(Stack<Integer>st,int sizeOfStack){
        ArrayList<Integer>al = new ArrayList<>() ;
        int cnt = 0;
        int mid = (sizeOfStack)/2 ;
        while(!st.isEmpty())
        {
            int temp = st.pop() ;
            if(cnt != mid)
            al.add(temp) ;
            cnt++;
        }
        
        for(int i = al.size()-1;i>=0;i--)
        st.add(al.get(i)) ;
    } 
}
