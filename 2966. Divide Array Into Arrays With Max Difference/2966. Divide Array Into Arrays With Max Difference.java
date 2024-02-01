class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int [][]ans = new int[nums.length/3][3] ;

        Arrays.sort(nums) ;

        int ind = 0;
        for(int i = 0;i<nums.length/3;i++)
        {
            for(int j=0;j<3;j++)
            ans[i][j] = nums[ind++] ;
        }

        boolean flag = false;

        for(int []a : ans)
        {
            int x = a[0] ;
            int y = a[1] ;
            int z = a[2] ;

            if(Math.abs(x-y)> k || Math.abs(y - z)> k || Math.abs(x-z)>k)
            {
                flag = true ;
                break;
            }
        }

        if(flag) return new int[][]{ } ;

        return ans;
    }
}
