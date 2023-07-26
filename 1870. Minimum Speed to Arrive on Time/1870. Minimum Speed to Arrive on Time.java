class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int i = 1;
        int j = (int) 1e7;
        int minSpeed = -1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (isPossible(dist, mid, hour)) {
                minSpeed = mid;
                j = mid - 1;
            } else
                i = mid + 1;
        }
        return minSpeed;
    }
     public boolean isPossible(int []dist, int speed, double hour) {
        double ans = 0;
        for (int i = 0; i < dist.length; i++) {
            double d = dist[i] * 1.0 / speed;
            if (i != dist.length - 1)
                ans = ans + Math.ceil(d);
            else
                ans += d;
            if (ans > hour)
                return false;
        }
        return ans <= hour;
    }
}
