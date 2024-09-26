
class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        if(arr.length==1)return 0;
        int ans = 0 ;
        
        int cnt = 0 ;
        for(int i = 1 ;i<arr.length;i++){
            if(arr[i]>arr[i-1])
            {
                cnt++;
            }
            else
            {
                ans= Math.max(ans,cnt);
                cnt = 0 ;
            }
        }
         ans= Math.max(ans,cnt);
        return ans;
    }
}
