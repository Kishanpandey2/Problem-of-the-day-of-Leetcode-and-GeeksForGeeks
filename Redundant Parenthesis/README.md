Redundant Parenthesis  =>
----------------------



Given a valid expression containing only binary operators '+', '-', '*', '/' and operands, remove all the redundant parenthesis.

A set of parenthesis is said to be redundant if, removing them, does not change the value of the expression.

Note: The operators '+' and '-' have the same priority. '*' and '/' also have the same priority. '*' and '/' have more priority than '+' and '-'.


Example 1:

Input:
Exp = (A*(B+C))
Output: A*(B+C)
Explanation: The outermost parenthesis
are redundant.
Example 2:

Input:
Exp = A+(B+(C))
Output: A+B+C
Explanation: All the parenthesis
are redundant.

Your Task:  
You don't need to read input or print anything. Your task is to complete the function removeBrackets() which takes the string Exp as input parameters and returns the updated expression.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)


Constraints:
1 < Length of Exp < 105
Exp contains uppercase english letters, '(' , ')', '+', '-', '*' and '/'.
