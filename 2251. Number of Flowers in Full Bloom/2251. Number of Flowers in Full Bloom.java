class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] persons) {
        int n = flowers.length;
        int[] starts = new int[n];
        int[] ends = new int[n];
        for (int i = 0; i < n; i++) {
            starts[i] = flowers[i][0];
            ends[i] = flowers[i][1];
        }
        Arrays.sort(starts);
        Arrays.sort(ends);

        int m = persons.length;
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            int x = binarySearch(starts, persons[i] + 1);
            int y = binarySearch(ends, persons[i]);
            ans[i] = x - y;
        }
        return ans;
    }

    int binarySearch(int[] arr, int target) {
        int res = arr.length;
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (arr[mid] >= target) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }
}
