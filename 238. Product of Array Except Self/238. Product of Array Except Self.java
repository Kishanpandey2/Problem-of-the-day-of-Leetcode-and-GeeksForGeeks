// Using Space

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length ;
        int []l = new int[n];
        int []r = new int[n] ;
        int []ans = new int[n];

        l[0] = 1;
        for(int i= 1;i<n;i++)
        l[i] = l[i-1]*nums[i-1];

        r[n-1] = 1;
         for(int i= n-2;i>=0;i--)
        r[i] = r[i+1]*nums[i+1];

         for(int i= 0;i<n;i++)
       ans[i] = l[i]*r[i];

       return ans;
    }
}




// Without using space 
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length ;
       
        int []ans = new int[n];

        int pro =  1;
        for(int i= 0;i<n;i++)
        {
            pro*= nums[i] ;
            ans[i] = pro;
        }

        pro =  1;
        
         for(int i= n-1;i>0;i--)
       {
            ans[i] = ans[i-1]*pro ;

            pro *= nums[i];
       }
       ans[0] = pro ;
       return ans;
    }
}
