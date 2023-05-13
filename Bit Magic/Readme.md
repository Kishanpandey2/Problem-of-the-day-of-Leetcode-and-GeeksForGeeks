Bit Magic   =>
- ----------


 

Given an integer array arr[] of size n which contains only 1 and 0. Your task is to make the array perfect. An array is said to be perfect if for each i from 0 to n-1 arr[i]==arr[n-1-i] is satisfied. 

To Make the array perfect you are allowed to do the following operation  :

In one operation you can choose two different indexes i and j and set value of both arr[i] and arr[j] to arr[i]^arr[j].

Your task is to make the array perfect in minimum possible number of operations and return the number of operations.

Note: 0-based indexing is used.

Example 1:

Input:
n = 4
arr = {1,0,0,0}
Output:
1
Explanation:
We can take index 0 and 3 and apply the operation.
Array becomes {1,0,0,1}.Now the condition is satisfied 
Example 2:

Input:
n = 3
arr = {1,0,1}
Output:
0
Explanation:
condition is satisfied intially. So no operation is required
in this case.
Your Task:
You don't need to read input or print anything. Your task is to complete the function bitMagic() which takes an integer n and a binary integers array arr respectively and returns the minimum number of operations required to make the array perfect. 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= n <= 10^5
0 <= arr[i] <=1
