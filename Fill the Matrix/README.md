Fill the Matrix =>
---------------



Given a matrix with dimensions N x M, entirely filled with zeroes except for one position at co-ordinates X and Y containing '1'. Find the minimum number of iterations in which the whole matrix can be filled with ones.
Note: In one iteration, '1' can be filled in the 4 neighbouring elements of a cell containing '1'.


Example 1:

Input:
N = 2, M = 3
X = 2, Y = 3
Output: 3 

Explanation: 3 is the minimum possible 
number of iterations in which the
matrix can be filled.
Example 2:

Input:
N = 1, M = 1
X = 1, Y = 1 
Output: 0

Explanation: The whole matrix is 
already filled with ones.

Your Task:  
You don't need to read input or print anything. Your task is to complete the function minIterations() which takes the dimensions of the matrix N and M and the co-ordinates of the initial position of '1' ie X and Y as input parameters and returns the minimum number of iterations required to fill the matrix.


Expected Time Complexity: O(N*M)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N, M ≤ 103
1 ≤ X ≤ N
1 ≤ Y ≤ M 
