// Brute Force solution

class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] ans = new int[temp.length] ;

        int cnt =0 ;

        for(int i =0 ;i<temp.length;i++){
            boolean flag = false;
            for(int j = i+1;j<temp.length;j++)
            if(temp[j]>temp[i])
            {
                ans[cnt++] = j-i ;
                flag = true ;
                break;
            }

            if(flag == false)
            ans[cnt++] = 0 ;
        }
        return ans;
    }
}




// Efficient solution
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer>st = new Stack<>() ;
        int []ans = new int[temp.length] ;
        

        for(int i =temp.length-1;i>=0;i-- ){
            while(!st.isEmpty() && temp[i]>=temp[st.peek()])
            st.pop() ;

            if(!st.isEmpty())
            ans[i] = st.peek() - i ;

            st.push(i);

        }

        return ans;
    }
}
