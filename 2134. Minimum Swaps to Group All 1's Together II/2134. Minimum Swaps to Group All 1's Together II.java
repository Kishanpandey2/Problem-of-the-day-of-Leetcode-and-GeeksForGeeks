class Solution {
    public int minSwaps(int[] nums) {
        int cone = 0 ;

        for(int i : nums)if( i== 1)cone++ ;

        int czero =0;
        for(int i = 0 ;i<cone;i++)
        if(nums[i]==0)czero++;

        int ans = czero ;

        for(int i = cone ;i<nums.length+cone ;i++)
        {
          if(nums[i%nums.length]==0)czero++;
          if(nums[(i-cone)%nums.length]==0)czero--;

          ans =Math.min(ans,czero);
        }

        return ans;
    }
}
