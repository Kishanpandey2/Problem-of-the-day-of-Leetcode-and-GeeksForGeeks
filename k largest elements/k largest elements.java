
class Solution {
    int[] kLargest(int[] arr, int n, int k) {
      
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int ans[]=new int[k];
        for(int i=0;i<n;i++)
        {
              pq.add(-arr[i]);
        }
        for(int i=0;i<k;i++)
        {
              ans[i]=Math.abs(pq.poll());
        }
        return ans;
    }
}
