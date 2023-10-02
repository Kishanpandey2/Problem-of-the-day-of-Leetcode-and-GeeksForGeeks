Number of distinct subsequences  =>
-------------------------------


Given a string consisting of lower case English alphabets, the task is to find the number of distinct subsequences of the string
Note: Answer can be very large, so, ouput will be answer modulo 109+7.

Example 1:

Input: 
s = "gfg"
Output: 
7
Explanation: 
The seven distinct subsequences are "", "g", "f", "gf", "fg", "gg" and "gfg" .
Example 2:

Input: 
s = "ggg"
Output: 
4
Explanation: 
The four distinct subsequences are "", "g", "gg", "ggg".
Your task:
You do not need to read any input or print anything. The task is to complete the function distinctSubsequences(), which takes a string as input and returns an integer.

Expected Time Complexity: O(|str|)
Expected Auxiliary Space: O(|str|)

Constraints:
1 ≤ |s| ≤ 105
s contains lower case English alphabets
