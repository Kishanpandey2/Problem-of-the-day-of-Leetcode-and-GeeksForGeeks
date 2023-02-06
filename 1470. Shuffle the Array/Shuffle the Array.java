class Solution {
    public int[] shuffle(int[] nums, int n) {
        if(nums.length==1)
        return nums ;
        int[] ans = new int[2*n] ;
        List<Integer>temp =new ArrayList<>() ;
        int c = 0 ;
        for(int i = 0 ;i<n;i++)
        temp.add(nums[i] ) ;
        for(int i = 0;i<n;i++){
            ans[c++]=temp.get(i) ;
            ans[c++]= nums[i+n] ;
        }
        return ans ;
    }
}
