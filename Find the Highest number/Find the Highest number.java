
class Solution {
    public int findPeakElement(List<Integer> a) {
          int left = 0;
        int right = a.size() - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (a.get(mid) > a.get(mid + 1)) {
                right = mid; 
            } else {
               left = mid + 1;
            }
        }
        return a.get(left);
    }
}
