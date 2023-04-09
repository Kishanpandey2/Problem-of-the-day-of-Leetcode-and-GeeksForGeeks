Special Digits= >
--------------   



You are given 5 integers - N,A,B,C,D.
Let us say all the integers of length N, having only A or B in their decimal representation are good integers. Also, among all the good integers, all those integers whose sum of digits contains either C or D or both are best integers.
Find the number of best integers of length N. Since the number of best integers can be huge, print it modulo 109+7.
 

Example 1:

Input:
N = 2, A = 1, B = 2, C = 3, D = 5
Output: 
2
Explanation: 
The following are good integers:- 
{ 12 , 22 , 11 , 21 }
And the following are best integers:- 
{ 12, 21 } because sum of digits of 11,22
are 2 and 4, they are not equal to C or D.
Example 2:

Input:
N = 1, A = 1, B = 1, C = 2, D = 3
Output: 
0
Explanation: 
The following are good integers: - { 1 }
Since sum of digits is 1 which is not equal to
C or D, therefore, answer is 0.
Your Task:
The task is to complete the function solve() which takes five integers N,A,B,C and D as input parameters and returns the number of best integers modulo 109+7.

Expected Time Complexity: O(NlogN)
Expected Space Complexity: O(N)

Constraints:
1 ≤ A, B, C, D ≤ 9
1 ≤ N ≤ 105
