class Solution {
    public static int[] asteroidCollision(int N, int[] asteroids) {
        // code here
        Stack<Integer>st = new Stack<>() ;
        for(int  i: asteroids)
        {
           if(i>0)
           st.push(i);
           else {
               while(!st.isEmpty() && st.peek()>0 && st.peek()< -i)
               st.pop();
               if(!st.isEmpty() && st.peek()>0 && st.peek() ==  -i)
               st.pop();
               else if(!st.isEmpty() && st.peek()>0 && st.peek() >  -i)
               {
                   
               }
               else
               st.push(i);
           }
        }
        int n = st.size();
        int []ans = new int[n];
        for(int i = n-1 ;i>=0;i--)
        {
            ans[i]= st.pop() ;
        }
        return ans ;
    }
}


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
