Taxi Booking =>
------------ 


You are going to book a taxi. There are infinite number of points 1, 2, 3... on the X axis and your current position is cur. There are N Taxis near you, and the position of those taxis is given as an array pos. Where pos[i] denotes the position of the ith taxi. You are also given an array time. Where time[i] denotes the time taken by the ith taxi to cover 1 unit of distance. Your task is to find the minimum time to board a taxi.

Example 1:

Input:
N = 3, cur = 4
pos = [1, 5, 6]
time = [2, 3, 1]
Output:
2
Explanation:
Total time taken by the 1st taxi will be: (4-1)*2 = 6
Total time taken by the 2nd taxi will be: (5-4)*3 = 3
Total time taken by the 3rd taxi will be: (6-4)*1 = 2
So, the minimum time will be 2 sec.
 

Example 2:

Input:
N = 2, cur = 1
pos = [1, 6]
time = [10, 3]
Output:
0
Explanation:
Total time taken by the 1st taxi will be: (1-1)*10 = 0
Total time taken by the 2nd taxi will be: (6-1)*3 = 15
So, the minimum time will be 0 sec.
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function minimumTime() which takes two integers N and cur, and 2 arrays pos, and time as input parameters and returns the minimum time required to board the taxi.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 105
1 ≤ cur ≤ 105
1 ≤ pos[i] ≤ 105
1 ≤ time[i] ≤ 103
