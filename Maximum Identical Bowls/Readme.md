Maximum Identical Bowls  ->
------------------------



There are N bowls containing cookies. In one operation, you can take one cookie from any of the non-empty bowls and put it into another bowl. If the bowl becomes empty you discard it. You can perform the above operation any number of times. You want to know the maximum number of bowls you can have with an identical number of cookies.

Note: All the non-discarded bowls should contain the identical number of cookies.

Example 1:

Input:
N = 3
arr[] = {3, 1, 5}
Output: 3
Explanation: We can put 2 cookies from the 3rd bowl
and put them into the 2nd bowl.Now the array
becomes {3, 3, 3}. Each bowl now contains 3 cookies.
Example 2:

Input:
N = 4
arr[] = {1, 2, 6, 5}
Output: 2
Explanation: We can take 6 cookies from the 3rd bowl 
and put them into 1st bowl, now the array becomes 
{7, 2, 0, 5}. We discard the 3rd array as it becomes
 empty. Hence, arr={7, 2, 5}. Now, we take 5 cookies 
from 3rd bowl and put them into the 2nd bowl. Hence 
arr={7, 7, 0}. Discarding 3rd empty bowl, number of 
bowls containing identical number of cookies i.e 7 is 2.
Your Task: 
You don't need to read input or print anything. Your task is to complete the function getMaximum() which takes the array arr[] and its size N as input parameters and returns the maximum number of bowls we can have with an identical number of cookies. 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 105
1 <= arr[i] <= 109
Array may contain duplicate elements.
