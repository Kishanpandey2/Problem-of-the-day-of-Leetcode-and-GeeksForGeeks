class Solution {
    public void sortColors(int[] nums) {
        int mid = 0 ,st  = 0, end = nums.length-1;

        while(mid<=end){
            if(nums[mid]==0 )
            {swap(nums,mid,st) ;
            st++;
                mid++;
                }
            else if(nums[mid]==1)mid++;
            else {
                swap(nums,mid,end);
                end--;
            }
        }
    }
    void swap(int []a,int i,int j){
        int t = a[i]; 
        a[i] = a[j] ;
        a[j] = t ;
    }
}
