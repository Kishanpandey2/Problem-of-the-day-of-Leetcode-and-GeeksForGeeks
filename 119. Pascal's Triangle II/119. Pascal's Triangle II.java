class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>() ;
       for(int i = 0 ;i<rowIndex+1;i++)
       ans.add(1);

        for(int i = 1 ;i<rowIndex;i++){
            for(int j = i;j>0 ;j--)
            ans.set(j,ans.get(j)+ans.get(j-1) ) ;
        }

        return ans;
    }
}
