Find Number  =>
-----------



Given an integer N, You need to find the Nth smallest number which only contains odd digits i.e. 1,3,5,7,9 means no even digits are allowed on that number (12 will not consider). For example, the starting numbers which only contain odd digits are 1,3,5,7,9,11,13,15,17,19,31,33,35 and so on.

Example 1:

Input:
N=3
Output:
5
Explanation:
First three numbers are 1, 3, 5.
Here 5 is the 3rd number, where contains
only odd digits.
Example 2:

Input:
N=13
Output:
35
Explanation:
First 13 numbers are 1,3,5,7,9,
11,13,15,17,19,31,33,35, here 35 
is the answer.
Your Task:
You don't need to read input or print anything. Your task is to complete the function findNumber() which takes a single variable N and returns the smallest Nth number which only contains odd digits.

Expected Time Complexity: O(logN)
Expected Space Complexity: O(1)

Constraints:
1 <= N <= 10^12
