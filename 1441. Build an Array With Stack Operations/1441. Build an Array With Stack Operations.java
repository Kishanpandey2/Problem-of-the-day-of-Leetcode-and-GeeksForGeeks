class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String>ans = new ArrayList<>() ;

        int cnt   = 1 ;

        for(int i : target){
            while(cnt < i)
            {
                ans.add("Push");
                 ans.add("Pop");
                 cnt++;
            }
            cnt++;
            ans.add("Push");
        }

        return ans;
    }
}
