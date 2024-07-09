
class Solution {
    static int threeSumClosest(int[] ar, int target) {
        
        Arrays.sort(ar);
        
        int ans = Integer.MIN_VALUE ;
        int dif = Integer.MAX_VALUE ;
            int n = ar.length ;
        for(int i =0 ;i<n;i++)
        {
             int j = i+1 , k = n-1;
             int sum = 0 ;
             while(j<k){
                 sum = ar[i]+ar[j]+ar[k];
                 
                 if(sum == target)return sum;
                 else if(sum < target){
                     if(Math.abs(sum - target) < dif)
                     {ans = sum ;
                         dif = Math.abs(sum - target);
                     }
                     j++;
                 }
                 else  {
                     if(Math.abs(sum - target) <= dif)
                     {ans = sum ;
                         dif = Math.abs(sum - target);
                     }
                     k--;
                 }
             }
        }
        
        return ans;
    }
}
