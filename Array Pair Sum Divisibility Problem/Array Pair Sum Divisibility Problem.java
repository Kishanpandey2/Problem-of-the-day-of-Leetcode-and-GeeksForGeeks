
class Solution {
    public boolean canPair(int[] nums, int k) {
        
        if(nums.length%2!=0)return false;
      int []temp = new int[k+1] ;
      for(int i = 0 ;i<nums.length;i++)
      {
          nums[i] = nums[i]%k ;
          temp[nums[i]]++ ;
      }
      if(temp[0]%2!=0)return false;
      
       int i = 1, j = k-1 ;
    while(i<=j)
     {
         if(temp[i]!=temp[j])
         {
        return false;
         }
         i++;j--;
     }
      
      
        
        return true;
    }
}
