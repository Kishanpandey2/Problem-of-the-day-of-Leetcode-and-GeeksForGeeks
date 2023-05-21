Bus Conductor  ->
--------------


You are conductor of a bus .There are n chairs and n passengers in the bus. You are given an array chairs of length n, where chairs[i] is the position of the ith chair. You are also given the array passengers of length n, where passengers[j] is the position of the jth passenger.

You may perform the following move any number of times:

Increase or decrease the position of the ith passenger by 1 (i.e., moving the ith passenger from position x to x + 1 or x - 1)
Return the minimum number of moves required to move each passenger to a chair such that no two passengers are in the same chair and every passenger gets a chair.

Note that there may be multiple chairs or passengers in the same position at the beginning.

Example 1:

Input: 
chairs = [3,1,5] 
passengers = [2,7,4]
Output: 4
Explanation: 
The passengers are moved as follows:
- The first passenger is moved from position 2 to position 1 using 1 move.
- The second passenger is moved from position 7 to position 5 using 2 moves.
- The third passenger is moved from position 4 to position 3 using 1 move.
In total, 1 + 2 + 1 = 4 moves were used.

Example 2:

Input: 
chairs = [2,2,6,6] 
passengers = [1,3,2,6]
Output: 4
Explanation: 
Note that there are two chairs at position 2 and two chairs at position 6.
The passangers are moved as follows:
- The first passenger is moved from position 1 to position 2 using 1 move.
- The second passenger is moved from position 3 to position 6 using 3 moves.
- The third passenger is not moved.
- The fourth passenger is not moved.
In total, 1 + 3 + 0 + 0 = 4 moves were used.
Your Task:
You don't need to read input or print anything. Your task is to complete the function findMoves() which take length of array, and two arrays chairs and passengers as input, and return an interger value as described above.

Expected Time Complexity: O(nlogn)
Expected Auxiliary Space: O(1)

Constraints:
   n == chairs.length == passengers.length
   1 <= n <= 10^5
   1 <= chairs[i], passengers[j] <= 100
