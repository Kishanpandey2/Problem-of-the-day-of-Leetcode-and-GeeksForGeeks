Count number of free cell =>
-------------------------- 



Suppose you have a Matrix size n*n, and given an integer k and a set of coordinates arr of size k*2. Initially, the matrix contains only 0. You are given k tasks and for each task, you are given two coordinates (r = arr[i][0],c = arr[i][1]) [1 based index r and c]. Where coordinates (r,c) denotes rth row and cth column of the given matrix.

You have to perform each task sequentially in the given order. For each task, You have to put 1 in all rth row cells and all cth columns cells.

After each task, You have to calculate the number of 0 present in the matrix and return it.

Example 1:

Input:
n = 3, k= 3
arr =
{{2, 2},
 {2, 3},
 {3, 2}}
Output: 4 2 1
Explanation: 
After 1st Operation, all the 2nd row
and all the 2nd column will be filled by
1. So remaning cell with value 0 will be 4
After 2nd Operation, all the 2nd row and all
the 3rd column will be filled by 1. So 
remaning cell with value 0 will be 2.
After 3rd Operation cells having value 0 will
be 1.
Example 2:

Input:
n = 2, k = 2
arr = 
{{1, 2},
 {1, 1}}
Output: 1 0
Explanation: 
After 1st Operation, all the 1st row and 
all the 2nd column will be filled by 1. 
So remaning cell with value 0 will be 1.
After 2nd Operation, all the 1st row and 
all the 1st column will be filled by 1. 
So remaning cell with value 0 will be 0. 
Your Task:
The task is to complete the function countZero(), which takes parameter n, size of
the matrix, k no of operation and array arr[][], which denotes the position of the cells.
You have to return an array that contains all the results.

Expected Time Complexity: O( k ).
Expected Auxiliary Space: O( n+n+k ).

Constraints:
1 <= n, k <= 105
1 <= r, c <= n
