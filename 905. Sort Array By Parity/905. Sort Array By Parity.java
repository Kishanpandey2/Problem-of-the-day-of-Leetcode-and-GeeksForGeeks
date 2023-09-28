class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int low = 0 , high =  nums.length - 1 ;
        while(low<high){
                if (nums[low]%2!=0 && nums[high]%2==0)
                {
                    swap(nums,low,high) ;
                    low++ ;
                    high-- ;
                }
                else if(nums[low]%2==0)
                low++; 
                else
                high-- ;
        }

        return nums ;
    }

    void swap(int []a,int i,int j){
        int t = a[i] ; a[i] =a[j] ; a[j] =t ;
    }
}
