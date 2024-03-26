// method - 1 ;  using space 

class Solution {
    public int firstMissingPositive(int[] nums) {
     Set<Integer>st =new HashSet<>() ;

     for(int i : nums)st.add(i) ;
     int i = 1 ;

     while(st.contains(i))i++;
     return i;   
    }
}


 // method -2 without using space 
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length ;
        for(int i  = 0 ;i<n;i++)
        {
            if(nums[i]<=0 || nums[i]>n)
            nums[i] = n+1 ;
        }

        for(int i = 0 ;i<n;i++)
        {
            int temp = nums[i] ;
            temp = Math.abs(temp);
            if(temp>n)continue ;

            temp-- ;
            if(nums[temp] >0)nums[temp] = -nums[temp];
        }

        for(int i = 0 ;i<n;i++)
        if(nums[i]>0)return i+1 ;

        return n+1;
    }
}
