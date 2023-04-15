Find Total Time Taken  =>
--------------------- 



You are given an array arr of size n, containing the values in between 1 to n & time of size n, containing time in sec, you are asked to determine the total time taken in order to pick all the array elements from left to right but there is a condition, If from left, previous elements are different it takes 1 Sec to pick & if element got repeated then it will take time[arr[i]].

NOTE:
1. It takes 1 sec to move from index i to i+1 (1 <= i < n).
2. 1-based indexing.

Example 1:

Input:
n = 4
arr = {1, 2, 3, 3}
time = {1, 2, 3, 4}
Output:
5
Explanation:
for 1st element(1) = 0 Sec-> total = 0
    2nd element(2) = 1 Sec-> total = 1+0=1
    3rd element(3) = 1 Sec-> total = 1+1=2
    4th element(3) : here element 3 is repeated
    so we have to calculate time by time[arr[i]]
    : time[arr[4]] => time[3] => 3 -> total = 2+3 =5
here you can see 4th element(3) is repeated
so time will be not 1 sec & we have to
calculate time by this: time[arr[i]],there
Index is 4 which means arr[4] gives 3 & then
time[3]=3.
Example 2:

Input:
n = 4
arr = {1, 2, 3, 4}
time = {1, 2, 3, 4}
Output:
3
Explanation:
for 1st element(1) = 0 Sec-> total = 0
    2nd element(2) = 1 Sec-> total = 1
    3rd element(3) = 1 Sec-> total = 2
    4th element(4) = 1 Sec-> total = 3
here you can see no elements are repeated
so time will be 1 sec else will have to 
calculate time by this: time[arr[i]].
Example 3:

Input:
n = 8
arr = {6, 6, 1, 8, 1, 1, 3, 1}
time ={8, 4, 1, 5, 2, 8, 9, 3}
Output:
35
Explanation:
for 1st element(6) = 0 Sec-> total = 0
    2nd element(6) = repeated element so
    time[arr[i]] = time[6] = 8 Sec-> total=8+0=8
    3rd element(1) = 1 Sec-> total = 8+1=9
    4th element(8) = 1 Sec-> total = 9+1=10
    5th element(1) = repeated 
    So, time[arr[i]] =time[1]=8 Sec-> total = 8+10 = 18
    6th element(1) = again repeated = 8 sec
    total = 18+8 = 26
    7th element(3) = 1 sec-> total = 26+1=27
    8th element(1) = 8 Sec (repeated)->
    total = 27+8 = 35
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function totalTime() which takes three variables n, arr, time, as explained in the problem statement, and returns the total time taken to pick all the elements.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 <= n <= 10^5
1 <= arr[i] <= n
1 <= time[i] <= 10^5
