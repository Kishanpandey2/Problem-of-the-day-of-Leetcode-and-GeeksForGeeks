
class Solution
{
    public static int wordBreak(int n, String s, ArrayList<String> dictionary )
    {
         Set<String> ws = new HashSet<>(dictionary);
        int N = s.length();
        boolean[] dp = new boolean[N + 1];
        dp[0] = true;

        for (int i=1;i<=N;i++) {
            for (int j=0;j<i;j++) {
                if (dp[j]&&ws.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }

        return dp[N] ?1:0;
    }
}
