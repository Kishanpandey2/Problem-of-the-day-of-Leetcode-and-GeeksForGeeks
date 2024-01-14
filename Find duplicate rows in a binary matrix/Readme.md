Find duplicate rows in a binary matrix  =>
--------------------------------------


Given a boolean matrix of size RxC where each cell contains either 0 or 1, find the row numbers (0-based) of row which already exists or are repeated.

Example 1:

Input:
R = 2, C = 2
matrix[][] = {{1, 0},
            {1, 0}}
Output: 
1
Explanation:
Row 1 is duplicate of Row 0.
Example 2:

Input:
R = 4, C = 3
matrix[][] = {{ 1, 0, 0},
            { 1, 0, 0},
            { 0, 0, 0},
            { 0, 0, 0}}
Output: 
1 3 
Explanation:
Row 1 and Row 3 are duplicates of Row 0 and 2 respectively. 
Your Task:
You dont need to read input or print anything. Complete the function repeatedRows() that takes the matrix as input parameter and returns a list of row numbers which are duplicate rows.

Expected Time Complexity: O(R * C)
Expected Auxiliary Space: O(R * C)

Constraints:
1 ≤ R, C ≤ 103
0 ≤ matrix[i][j] ≤ 1
