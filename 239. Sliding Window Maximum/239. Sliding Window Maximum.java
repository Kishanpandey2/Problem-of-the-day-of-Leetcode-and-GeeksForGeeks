class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int []ans = new int[nums.length - k +1];

        Stack<Integer>st = new Stack<>() ;
        int []nge = new int[nums.length] ;

        st.push(nums.length-1) ;
        nge[nums.length-1] =  nums.length ;

        for(int i = nums.length-2;i>=0;i--)
        {
            while(st.size()>0 &&  nums[i]>= nums[st.peek()])
            st.pop();


            if(st.size()==0)
            nge[i] = nums.length ;
            else
            nge[i] = st.peek();

            st.push(i);
        }
        int j = 0 ;
        for(int i = 0 ;i<=nums.length-k;i++)
        {
            if(j<i)
            j=i;

            while(nge[j]<i+k)
            j = nge[j] ;    

            ans[i] = nums[j];        
        }

        return ans;
    }
}
