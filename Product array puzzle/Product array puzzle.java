
class Solution {
    public static long[] productExceptSelf(int nums[]) {
        long []l = new long[nums.length];
        long []r = new long[nums.length];   
        long ans[] = new long[nums.length];
        
        l[0] = 1;
        for(int i = 1;i<nums.length;i++){
            l[i] = l[i-1]* nums[i-1];
        }
        
        
        r[nums.length-1] = 1;
        for(int i = nums.length-2;i>=0;i--){
            r[i] = r[i+1]* nums[i+1];
        }
        
        for(int i = 0 ;i<nums.length;i++)
        ans[i] = l[i]*r[i];
        
        return ans;
    }
}
