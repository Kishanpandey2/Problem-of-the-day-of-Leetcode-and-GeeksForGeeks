// Brute force solution 

class Solution {
    public int maxIntersections(int[][] lines, int N) {
        int ans = 1 ;
        for(int i = 0 ;i<N ;i++){
            int cur = 1 ;
            for(int j = 0 ;j<N;j++){
                if(i!=j ){
                    if(lines[i][0]>=lines[j][0] && lines[i][0]<=lines[j][1])
                    cur++;
                }
            }
            ans = Math.max(ans,cur) ;
        }
        return ans ;
    }
}



// Efficient solution 
class Solution {
    public int maxIntersections(int[][] lines, int N) {
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for(int[] x : lines){
            int st = x[0], end = x[1]+1;
           
            mp.put(st, mp.getOrDefault(st,0) + 1);
            mp.put(end, mp.getOrDefault(end,0) - 1);
            
        }
        int ans = 0, curr = 0;
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            curr += entry.getValue();
            ans = Math.max(ans, curr);
        }
        return ans;
    }
}
