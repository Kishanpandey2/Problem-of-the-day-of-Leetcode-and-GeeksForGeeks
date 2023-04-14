Remove the balls  =>
----------------


Imagine an imaginary array of length N containing balls. Given 2 arrays color and radius of length N each, where color[i] represents the color of the ith ball while radius[i] represents the radius of ith ball. If two consecutive balls have the same color and size, both are removed from the array. Geek wants to know the length of the final imaginary array.

Example 1:

Input:
N = 3
color[] = {2, 2, 5}
radius[] = {3, 3, 4}
Output: 
1
Explanation: 
First ball and second ball have same color 2 and 
same radius 3.So,after removing only one ball 
is left.It could not be removed from the array. 
Hence, the final array has length 1.
Example 2:

Input:
N = 4
color[] = {1, 3, 3, 1}
radius[] = {2, 5, 5, 2}
Output:
0
Explanation:
Ball 2 and ball 3 have same color 3 and same radius
5.So,they are removed. Now, we have got our
color[]={1, 1} and radius[]={2, 2}.Both the left
balls are consecutive now and they are having
same color and radius. So,these two balls are
removed as well. Now,we are left with empty
final array. Hence, the length of final array is 0.
Your Task: 
You don't need to read input or print anything. Your task is to complete the function finLength(), which takes integer N and array color[ ] and array radius[ ] as input parameters and returns the size of the final imaginary array.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 ≤ N ≤ 105
1 ≤ color[i] ≤ 109
1 ≤ radius[i] ≤ 109    
