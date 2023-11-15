// Naive solution
  
class Solution {
    public static String betterString(String str1, String str2) {
        int t1 = getAllSubsequence(str1);
        int t2 = getAllSubsequence(str2);
        
        if(t2>t1)return str2 ;
        return str1 ;
    }
    
    private static int getAllSubsequence(String s){
        Set<String>st = new HashSet<>() ;
        
        generateSubsequence(s,"",0,st) ;
        
        return st.size() ;
    }
    
    private static void generateSubsequence(String s,String cur, int ind, Set<String>ans){
        if(ind == s.length())
        {
            ans.add(cur) ;
            return;
        }
        
        generateSubsequence( s, cur+s.charAt(ind), ind+1, ans);
        generateSubsequence( s, cur, ind+1, ans);
        
    }
}




//Efficient solution
  public static String betterString(String str1, String str2) {
        // Count the number of substrings of each string
        int a = countSub(str1);
        int b = countSub(str2);
        
        // Return the string with more substrings
        if (a < b) {
            return str2;
        }
        return str1;
    }
    
    
    static int countSub(String str) {
        // map to store the last occurrence of characters
      Map<Character, Integer> map = new HashMap<>();
       
        int n = str.length();
        int[] dp = new int[n + 1];

        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            
            dp[i] = 2 * dp[i - 1];

            if (map.containsKey(str.charAt(i - 1))) {
                dp[i] = dp[i] - dp[map.get(str.charAt(i - 1))];
            }
            map.put(str.charAt(i - 1), (i - 1));
        }
        return dp[n];
    }
