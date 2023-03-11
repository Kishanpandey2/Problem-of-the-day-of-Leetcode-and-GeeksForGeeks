class Solution {
    public static ArrayList<Integer> solveQueries(int N, int num, int[] A, int[][] Q) {
        ArrayList<Integer> res=new ArrayList<>();
        
        for(int i=0; i<num; i++){
            int low=Q[i][0];
            int high=Q[i][1];
            int k=Q[i][2];
            
            //freq map
            Map<Integer, Integer> map=new HashMap<>();
            int count=0;
            
            for(int j=N-1; j>=low; j--){
                //put
                map.put(A[j], map.getOrDefault(A[j], 0) + 1);
                
                //check
                if(j<=high && map.get(A[j])==k){
                    count++;
                }
            }

            //add into res
            res.add(count);
        }
        
        return res;
        
    }
}
