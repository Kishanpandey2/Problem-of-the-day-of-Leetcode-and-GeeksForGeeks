class Solution {
    static int [] fact;
    static ArrayList<Integer> digits;
    public static void solve(int n, int k, StringBuilder ans){
        if(n==1){
            ans.append(Integer.toString(digits.get(0)));
            return;
        }
        int ind = k/fact[n-1];
        if(k%(fact[n-1]) == 0) ind--;
        
        ans.append(Integer.toString(digits.get(ind)));
        digits.remove(ind);
        k -= fact[n-1]*ind;
        
        solve(n-1, k, ans);
    }
    public static String kthPermutation(int n,int k) {
        // code here
        fact = new int [n];
        fact[0] = 1;
        for(int i=1; i<n; i++){
            fact[i] = i*fact[i-1];
        }
        digits = new ArrayList<>();
        for(int i=1; i<=n; i++){
            digits.add(i);
        }
        StringBuilder res = new StringBuilder();
        solve(n,k,res);
        return res.toString();
    }
}
