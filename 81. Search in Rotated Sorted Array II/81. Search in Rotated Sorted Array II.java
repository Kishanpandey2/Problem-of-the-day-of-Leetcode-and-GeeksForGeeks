// Brute Force or Naive solution


class Solution {
    public boolean search(int[] nums, int target) {
        for(int i : nums)
        if(i==target)return true ;

        return false;
    }
}


// Efficient solution
class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0 , h = nums.length - 1;
        //Arrays.sort(nums);
        while(l<=h)
        {
            int mid = l+(h-l)/2 ;

            if(nums[mid]==target)return true;

            else if(nums[l]<=nums[mid])
            {
                if(target>= nums[l] && target<nums[mid])
                h = mid - 1 ;
                else
                l = mid+1 ;
            }
            else
            {
                 if(target> nums[mid] && target<=nums[h])
                 l = mid+1 ;
                else
               h = mid - 1 ;
            }
        }

        return false;
    }
}
