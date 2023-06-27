class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0 || k <= 0) {
            return res;
        }
        
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] + a[1] - b[0] - b[1]);
        Set<String> visited = new HashSet<>();
        
        heap.offer(new int[]{nums1[0], nums2[0], 0, 0});
        visited.add("0,0");
        
        while (k > 0 && !heap.isEmpty()) {
            int[] curr = heap.poll();
            int i = curr[2];
            int j = curr[3];
            res.add(List.of(curr[0], curr[1]));
            k--;
            
            if (i + 1 < nums1.length && !visited.contains((i + 1) + "," + j)) {
                heap.offer(new int[]{nums1[i + 1], nums2[j], i + 1, j});
                visited.add((i + 1) + "," + j);
            }
            
            if (j + 1 < nums2.length && !visited.contains(i + "," + (j + 1))) {
                heap.offer(new int[]{nums1[i], nums2[j + 1], i, j + 1});
                visited.add(i + "," + (j + 1));
            }
        }
        
        return res;
    }
}
