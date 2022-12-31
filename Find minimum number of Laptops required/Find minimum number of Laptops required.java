class Solution {
    public int minLaptops(int N, int[] start, int[] end) {
        // code here
        TreeMap<Integer,Integer> map = new TreeMap<>();
        
        for(int i: start)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i: end)
        {
            map.put(i,map.getOrDefault(i,0)-1);
        }
        int sum  = 0 , res = 0 ;
        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            sum+=e.getValue();
            res = Math.max(res,sum);
        }
        return res;
    }
}


Expected Time Complexity: O(N*logN)
Expected Auxiliary Space: O(N)
