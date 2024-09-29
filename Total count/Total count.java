
class Solution {
    int totalCount(int k, int[] arr) {
        int ans = 0 ;
        
        for(int i : arr)
        {
            int div = i / k ;
            if((i%k)!=0)
            div++;
            
            ans+= div ;
        }
        
        return ans;
    }
}
