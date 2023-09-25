
class Solution {
    static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        
        
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(A);
        Arrays.sort(B);
        
        Queue<int[]> pq = new PriorityQueue<>((o1,o2)->(o2[0]-o1[0]));
        pq.add(new int[]{B[N-1]+A[N-1],N-1,N-1});
        
        while(!pq.isEmpty() && K>0)
        {
            int x[] = pq.poll();
            ans.add(x[0]);
            if(x[1]==N-1 && x[2]-1>=0)
            {
                pq.add(new int[]{B[x[2]-1]+A[N-1],N-1,x[2]-1});
            }
            
            if(x[1]-1>=0)
            {
                pq.add(new int[]{B[x[2]]+A[x[1]-1],x[1]-1,x[2]});
            }
            K--;
            
        }
        
        return ans;
    }
}
