class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums) ;

        int mxCnt = 0 , mele =  -1  ;

        int cnt = 1 ;
        int i ;
        for( i = 0 ;i<nums.length-1;i++)
        {
            if(nums[i] == nums[i+1])
            cnt++;
            else
            {
                if(cnt>mxCnt)
                {
                    mxCnt = cnt ;
                    cnt = 1;
                    mele = nums[i];
                }
            }
        }
         if(cnt>mxCnt)
                {
                    mxCnt = cnt ;
                    mele = nums[i];
                }
        return mele ;
    }
}
