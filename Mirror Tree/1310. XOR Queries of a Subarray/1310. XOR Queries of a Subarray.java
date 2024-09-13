class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int []left = new int[arr.length];

        left[0] = arr[0];
        for(int i =1;i<arr.length;i++)
        left[i] = left[i-1]^arr[i];

        int []ans = new int[queries.length];

        for(int i  = 0 ;i<ans.length;i++)
        {
            int st = queries[i][0] ;
            int end = queries[i][1];

            if(st == 0 )
            ans[i] = left[end];
            else
            ans[i] = left[end]^left[st-1];
        }

        return ans;
    }
}
