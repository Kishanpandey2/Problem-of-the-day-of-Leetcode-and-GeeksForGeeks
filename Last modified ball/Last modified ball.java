class Solution {
    int solve(int N, int[] A) {
       
        for(int i = N-1 ;i>=0;i--)
        {
            if(A[i]<9)
            return i+1 ;
        }
        return 0;
    }
};



Time Complexity -> O(n)
Space Complexity -> O(n)
