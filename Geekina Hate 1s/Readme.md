Geekina Hate 1s  =>
---------------


It is a universal fact that Geekina hates 1s however it is also known that Geekina loves the integers having atmost k 1s (set-bits) in their binary representation. 

Geekina demanded nth such non-negative number from Geek, and being a good friend of Geek, now it's your responsibility to tell him that number.

Note: The test cases are generated such that the answer always exists and will fit in the 64-bit data type.

Example 1:

Input:
n = 5
k = 1
Output:
8
Explanation:
Following numbers are loved by Geekina -
0 = (0)2
1 = (1)2
2 = (10)2
4 = (100)2
8 = (1000)2
Example 2:

Input:
n = 6
k = 2
Output:
5
Explanation:
Following numbers are loved by Geekina -
0 = (0)2
1 = (1)2
2 = (10)2
3 = (11)2
4 = (100)2
5 = (101)2
Your Task:
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function findNthNumer() that takes n and k as input parameters. Return the nth number having at most k set-bits.

Expected Time Complexity: O(k*log(n) + constant)
Expected Auxiliary Space: O(k*log(n) + constant)

Constraints:
1 <= n <= 109
1 <= k <= 63
