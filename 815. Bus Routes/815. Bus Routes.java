class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if (source == target) {
            return 0;
        }
        int maxStop = -1;
        for (int[] route : routes) {
            for (int stop : route) {
                maxStop = Math.max(maxStop, stop);
            }
        }
        if (maxStop < target) {
            return -1;
        }
        int n = routes.length;
        int[] minBusesToReach = new int[maxStop + 1];
        Arrays.fill(minBusesToReach, n + 1);
        minBusesToReach[source] = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int[] route : routes) {
                int min = n + 1;
                for (int stop : route) {
                    min = Math.min(min, minBusesToReach[stop]);
                }
                min++;
                for (int stop : route) {
                    if (minBusesToReach[stop] > min) {
                        minBusesToReach[stop] = min;
                        flag = true;
                    }
                }
            }
            
        }
        return (minBusesToReach[target] < n + 1 ? minBusesToReach[target] : -1);
    }
}
