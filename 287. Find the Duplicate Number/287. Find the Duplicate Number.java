class Solution {
    public int findDuplicate(int[] nums) {
         int n = nums.length ; 

         int max = 0  ;
         int maxInd = 0 ;

         for(int i = 0 ;i<n;i++){
             int ind = nums[i]%n  ;
             nums[ind]+= n ;
         }

         for(int i = 0;i<n;i++){
             if(nums[i]>max){
                 max = nums[i] ;
                 maxInd = i ;
             }
             nums[i] %= n ;
         }

         return maxInd ;
    }
}
