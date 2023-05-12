Array Operations  =>
-----------------


 

You are given an array arr of n integers. You must return the minimum number of operations required to make this array 0. For this you can do an operation :

Choose a sub-array of non-zero elements & replace all with 0(0 must be present in arr, if not you can not replace it).
Example 1:

Input:
n = 4
arr = {3,0,4,5}
Output:
2
Explanation:
First, we can choose 3 replace with 0(which is on 1st Index) and in the second operation, we can choose 4 & 5 -> replace with 0(1st Index).

Example 2:

Input:

n = 8 
arr = {10,4,9,6,10,10,4,4} 
Output: 
-1 
Explanation: 
If we do operations here, we can not make the entire 0 
because no 0 is present in the array, hence -1.
Your Task:
You don't need to read input or print anything. Your task is to complete the function arrayOperations() which takes an integer n and an array arr as inputs and find the minimum number of operations you must perform to make all the elements of the array 0. If not possible return -1;

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= n <= 105
0 <= arr[i] <= 109
