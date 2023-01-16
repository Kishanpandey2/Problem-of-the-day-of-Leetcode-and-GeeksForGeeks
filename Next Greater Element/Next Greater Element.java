class Solution{
    public static long[] nextLargerElement(long[] arr, int n) { 
        
        Stack<Long>st =new Stack<>() ;
        st.push(arr[n-1]) ;
        long []res = new long[arr.length] ;
        res[n-1]= -1 ;
        for(int i = n-2;i>=0;i--)
        {
            while(!st.isEmpty()&& st.peek()<arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            res[i]= -1 ;
            else
            res[i] = st.peek();
            st.push(arr[i]) ;
        }
       return res;
    } 
}

Time Complexity : O(n) 
Space Complexity : O(n) 
