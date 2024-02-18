Sum of leaf nodes in BST  ->
------------------------


Given a Binary Search Tree with n nodes, find the sum of all leaf nodes. BST has the following property (duplicate nodes are possible):

The left subtree of a node contains only nodes with keys less than the node’s key.
The right subtree of a node contains only nodes with keys greater than or equal to the node’s key.
Your task is to determine the total sum of the values of the leaf nodes.

Note: Input array arr doesn't represent the actual BST, it represents the order in which the elements will be added into the BST.

Example 1:
Input:
n = 6
arr = {67, 34, 82, 12, 45, 78}
Output:
135
Explanation:
In first test case, the BST for the given input will be-
                67
             /     \
           34       82
          /   \    /
         12   45  78

Hence, the required sum= 12 + 45 + 78 = 135

Example 2:
Input:
n = 1
arr = {45}
Output:
45
Explanation:
As the root node is a leaf node itself, 
the required sum will be 45
Your Task:
You don't have to take any input or print anything. You are required to complete the function sumOfLeafNodes that takes root node of a BST with n nodes as parameter and returns the sum of leaf nodes. 

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 <= n <= 104
1 <= Value of each node <= 105

