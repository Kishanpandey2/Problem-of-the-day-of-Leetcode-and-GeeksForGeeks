
class Solution {
   static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr, int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[n];
        Collections.sort(arr);
        generatePermutations(arr, n, new ArrayList<>(), used, result);
        return result;
    }

    static void generatePermutations(ArrayList<Integer> arr, int n, ArrayList<Integer> current, boolean[] used, ArrayList<ArrayList<Integer>> result) {
        if (current.size() == n) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (used[i] || (i > 0 && arr.get(i) == arr.get(i - 1) && !used[i - 1])) {
                continue;
            }

            used[i] = true;
            current.add(arr.get(i));
            generatePermutations(arr, n, current, used, result);
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
};
