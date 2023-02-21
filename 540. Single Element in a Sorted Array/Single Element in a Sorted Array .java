// Naive solution or brute force solution 
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int xor = nums[0] ;
        for(int i = 1 ;i<nums.length ;i++){
            xor^=nums[i] ;
        }
        return xor ;
    }
}



// Efficient solution or Optimise solution 
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low =0  ;
        int high = nums.length-2 ;
        while(low<=high){
            int mid = low + ( high - low)/2 ;
            if((mid%2==0) && (nums[mid+1] == nums[mid]) )
            {
                low = mid+1 ;
            }
            else if((mid%2!=0) && (nums[mid-1] == nums[mid]) )
            {
                low = mid+1 ;
            }
            else 
            high = mid-1 ;
        }
        return nums[low] ;
    }
}
