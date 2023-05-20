Hands of Straights   =>
-------------------



Alice has some cards, each card has one number written on it. She wants to rearrange the cards into groups so that each group is of size groupSize, and consists of groupSize consecutive cards.
Given an integer array hand of size N where hand [ i ] is the value written on the ith card and an integer groupSize, return true if she can rearrange the cards, or false otherwise.

Example 1:

Input:
N = 9
groupSize = 3
hand[ ] = {1, 2, 3, 6, 2, 3, 4, 7, 8}
Output: true
Explanation: 
Alice's hand can be rearranged as {1, 2, 3} , {2, 3, 4}, {6, 7, 8}. There are three groups with size 3. Each group has 3 consecutive cards.
Example 2:

Input:
N = 5
groupSize = 2
hand[ ] = {1, 2, 3, 4, 5}
Output: false
Explanation: 
Alice's hand cannot be rearranged into groups of 2. Since there are 5 cards and 5 cards cannot be divided into groups of 2.
Your Task:
You don't need to read input or print anything. Your task is to complete the function isStraightHand() which takes the interger N, integer groupSize and an integer array hand as parameters and returns the true if specified arrangement is possible.

Expected Time Complexity: O(Nlog(N))
Expected Auxiliary Space: O(N)

Constraints:
1 ≤ N ≤ 105
1 ≤ groupSize ≤ N
0 ≤ handi ≤ 109
