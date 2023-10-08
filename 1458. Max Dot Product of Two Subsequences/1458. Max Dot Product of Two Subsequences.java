class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int curr[] = new  int[n+1];
        int prev[] = new int[n+1];

        Arrays.fill(curr, Integer.MIN_VALUE);
        Arrays.fill(prev, Integer.MIN_VALUE);

        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                int cur_prod = nums1[i-1]*nums2[j-1];
                curr[j] = Math.max(Math.max(Math.max(cur_prod,prev[j]),curr[j-1]),cur_prod+(Math.max(0,prev[j-1])));
            }

            int[] temp = curr;
            curr=prev;
            prev=temp;
        }
        return prev[n];
    }
}
