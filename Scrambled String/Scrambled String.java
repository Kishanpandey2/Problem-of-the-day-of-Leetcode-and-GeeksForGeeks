class Solution{
    static boolean isScramble(String s1,String s2)
    {
        int n = s1.length();
        HashMap<String, Boolean> dp = new HashMap<>();
        return isPossible(s1, s2, dp);
    }
    
    static boolean isPossible(String s1, String s2, HashMap<String, Boolean> dp){
        if(s1.equals(s2)) return true;
        if(s1.length() <= 1){
            return false;
        }
        
        String key = s1 + ":" + s2;
        if(dp.containsKey(key)) return dp.get(key);
        
        int n = s1.length();
        boolean swapped = false, notSwapped = false;
        for(int i = 1; i <= n - 1; i++){
            swapped = isPossible(s1.substring(0, i), s2.substring(n - i), dp) &&
                    isPossible(s1.substring(i), s2.substring(0, n-i), dp);

            notSwapped = isPossible(s1.substring(0, i), s2.substring(0, i), dp) &&
                    isPossible(s1.substring(i), s2.substring(i), dp);
            if(swapped || notSwapped) break;
        }
        dp.put(key, swapped | notSwapped);
        return swapped | notSwapped;
    }
}
