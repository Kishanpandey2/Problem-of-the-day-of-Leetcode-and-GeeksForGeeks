public class Solution {
    public int largestVariance(String s) {
        int count1 = 0;
        int count2 = 0;
        int maxVariance = 0;

        // Create a distinct set of character pairs
        HashSet<Character> distinctChars = new HashSet<>();
        for (char c : s.toCharArray()) {
            distinctChars.add(c);
        }

        // Run once for original string order, then again for reverse string order
        for (int runs = 0; runs < 2; runs++) {
            for (char l1 : distinctChars) {
                for (char l2 : distinctChars) {
                    if (l1 == l2) {
                        continue;
                    }
                    count1 = count2 = 0;
                    for (char letter : s.toCharArray()) {
                        if (letter == l1) {
                            count1++;
                        } else if (letter == l2) {
                            count2++;
                        }
                        if (count1 < count2) {
                            count1 = count2 = 0;
                        } else if (count1 > 0 && count2 > 0) {
                            maxVariance = Math.max(maxVariance, count1 - count2);
                        }
                    }
                }
            }

            // Reverse the string for the second time around
            s = new StringBuilder(s).reverse().toString();
        }

        return maxVariance;
    }
}
