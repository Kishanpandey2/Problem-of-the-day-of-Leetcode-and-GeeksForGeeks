class Solution {
    public int maximumScore(int[] nums, int k) {
        
        int []min = new int[nums.length] ;
        min[k] = nums[k] ;

        for(int i = k-1;i>=0;i--)
        min[i] = Math.min(nums[i],min[i+1]) ;
        
        for(int i = k+1;i<nums.length;i++)
        min[i] = Math.min(nums[i],min[i-1]) ;

        int i = k-1, j = k+1 ;
        int res = min[k] ;
        while(i>=0 && j<nums.length){
            if(min[i]>=min[j]){
                res = Math.max(res,min[i]*(j-i)) ;
                i-- ;
            }
            else
            {
                res = Math.max(res,min[j]*(j-i)) ;
                j++ ;
            }
        }
        while(i>=0 ){
             res = Math.max(res,min[i]*(j-i)) ;
                i-- ;
        }
        while(j<nums.length){
            res = Math.max(res,min[j]*(j-i)) ;
                j++ ;
        }


        return res;
    }
}
