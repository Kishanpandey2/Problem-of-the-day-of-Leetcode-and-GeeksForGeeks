class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean in  = true ;
        boolean dec = true ;

        for(int i= 0 ;i<nums.length -1 ;i++){
            if(nums[i+1]- nums[i] > 0)
            dec = false ;
            
            if(nums[i+1]- nums[i] < 0)
            in = false ;

            if(in == false && dec == false)return false ;
        }

        return in || dec ;
    }
}
