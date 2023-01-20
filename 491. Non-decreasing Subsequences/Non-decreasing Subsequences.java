class Solution {
    Set <List<Integer>>ans  ;
    public List<List<Integer>> findSubsequences(int[] nums) {
        ans = new HashSet() ;
        ArrayList<Integer>t = new ArrayList<>() ;
        solve(nums,0,t) ;
        return new ArrayList(ans) ;
    }
    void solve(int []nums, int index , ArrayList<Integer>t) {
        if(t.size()>=2)
        ans.add(new ArrayList(t)) ;
        for(int i =index ;i<nums.length ;i++)
        {
            if(t.size()==0|| t.get(t.size()-1)<=nums[i])
            {
                t.add(nums[i]) ;
                solve(nums,i+1,t); 
                t.remove(t.size()-1) ;
            }
        }
    }
}

