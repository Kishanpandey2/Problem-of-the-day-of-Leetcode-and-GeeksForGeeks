class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean>ans = new ArrayList<>();
        List<Integer>temp = null;
        
        for(int i = 0 ;i<l.length;i++){
            int st = l[i] , end = r[i] ;
            temp = new ArrayList<>();
           
            for(;st<=end;st++)
            {
                temp.add(nums[st]);
             
            }
            boolean flag = check(temp) ;

            ans.add(flag);
        }

        return ans;
    }

    private boolean check(List<Integer> no){
        int n = no.size() ;
        Collections.sort(no) ;

        int dif = no.get(1)- no.get(0);

        for(int i = 2;i<n;i++)
        {
            if(no.get(i)-no.get(i-1)!=dif)return false;
        }
        return true ;
    }
}
