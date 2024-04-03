Kth common ancestor in BST  =>
--------------------------


Given a BST with n (n>=2) nodes, find the kth common ancestor of nodes x and y in the given tree. Return -1 if kth ancestor does not exist.

Nodes x and y will always be present in the input of a BST, and x != y.

Example 1:

Input: 
Input tree

k = 2, x = 40, y = 60 
Output:
30
Explanation:
Their 2nd common ancestor is 40.
Example 2:

Input: 
Input tree

k = 2, x = 40, y = 60
Output:
-1
Explanation:
LCA of 40 and 60 is 50, which is root itself. There does not exists 2nd common ancestor in this case.
Your task :
You don't have to read input or print anything. Your task is to complete the function kthCommonAncestor() that takes the root of the tree, k, x and y as input and returns the kth common ancestor of x and y.
 
Expected Time Complexity: O(Height of the Tree)
Expected Space Complexity: O(Height of the Tree)
 
Your Task :
1 <= n, k <= 105
1 <= node->data, x, y <= 109
