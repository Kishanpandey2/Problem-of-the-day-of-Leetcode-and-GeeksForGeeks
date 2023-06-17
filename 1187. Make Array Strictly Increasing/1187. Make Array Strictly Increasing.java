class Solution {
    
    HashMap<Integer, Integer> dp[];
    TreeSet<Integer> ts;
    
    int makeArrayIncr(int i, int prev, int[] arr1) {
        
        if(i == arr1.length) return 0;
        
        if(dp[i].containsKey(prev)) return dp[i].get(prev);
        
        int notswap = 5000;
        
        if(arr1[i] > prev) notswap = makeArrayIncr(i + 1, arr1[i], arr1);
        
        int swap = 5000;
        
        Integer curr = ts.higher(prev);
        
        if(curr != null) swap = 1 + makeArrayIncr(i + 1, curr, arr1);
        
        dp[i].put(prev, Math.min(swap, notswap));
        
        // System.out.println(i + " " + swap + " " + notswap);
        
        return Math.min(swap, notswap);
        
    }
    
    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        
        ts = new TreeSet<>();
        for(int i : arr2) ts.add(i);
        
        dp = new HashMap[arr1.length];
        for(int i = 0; i < dp.length; i++) dp[i] = new HashMap<>();
        
        int ans = makeArrayIncr(0, Integer.MIN_VALUE, arr1);
        
        return ans < 5000 ? ans : -1; 
    }
}
