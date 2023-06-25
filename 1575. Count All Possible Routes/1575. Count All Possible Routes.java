class Solution {
    private static final int MOD = 1000000007;

    public int helper(int[] locations, int city, int finish, int remainFuel, Integer[][] memo) {
        if (remainFuel < 0) {
            return 0;
        }
        
        if (memo[city][remainFuel] != null) {
            return memo[city][remainFuel];
        }
        
        int total = city == finish ? 1 : 0;
        
        for (int nextCity = 0; nextCity < locations.length; nextCity++) {
            if (nextCity != city && remainFuel >= Math.abs(locations[nextCity] - locations[city])) {
                total = (total + helper(locations, nextCity, finish, remainFuel - Math.abs(locations[nextCity] - locations[city]), memo)) % MOD;
            }
        }
        
        return memo[city][remainFuel] = total;
    }

    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        int n = locations.length;
        Integer[][] memo = new Integer[n][fuel + 1];
        return helper(locations, start, finish, fuel, memo);
    }
}
