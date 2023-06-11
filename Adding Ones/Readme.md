Adding Ones  =>
-----------



You start with an array A of size N. Initially all elements of the array A are zero. You will be given K positive integers. Let j be one of these integers, you have to add 1 to all A[i], where i ≥ j. Your task is to print the array A after all these K updates are done.

Note: 1-based indexing is followed for updates.

Example 1:

Input:
N = 3, K = 4
1 1 2 3
Output:
2 3 4
Explanation:
Initially the array is {0, 0, 0}. After the
first 1, it becomes {1, 1, 1}. After the
second 1 it becomes {2, 2, 2}. After 2, 
it becomes {2, 3, 3} and 
After 3 it becomes, {2, 3, 4}. 
Example 2:

Input:
N = 2, K = 3
1 1 1
Output:
3 3 
Explanation:
Initially the array is {0, 0}. After the
first 1, it becomes {1, 1}. After the
second 1 it becomes {2, 2}. After the
third 1, it becomes {3, 3}.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function update() which takes the array A[] and its size N as inputs and make the updates and fill the array A[].

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N, K ≤ 105

1 ≤ updates[i] ≤ N, for all i from 1 to N.
