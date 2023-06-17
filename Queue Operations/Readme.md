Queue Operations  =>
-----------------


Given N integers, the task is to insert those elements in the queue. Also, given M integers, the task is to find the frequency of each number in the Queue.
Note:

insert() will be called N times by main().
findFrequency() will be called M times by main();
Where k is each element passing through respective function calls.
Example 1:

Input:
N = 8
1 2 3 4 5 2 3 1
M = 5
1 3 2 9 10
Output:
2
2
2
-1
-1
Explanation:
After inserting 1, 2, 3, 4, 5, 2, 3 and 1 into the queue, frequency of 1 is 2, 3 is 2 and 2 is 2. Since 9 and 10 are not there in the queue we output -1 for them.
Example 2:

Input:
N = 6
1 2 1 1 1 4
M = 4
1 5 4 3
Output:
4
-1
1
-1
Explanation:
After inserting 1, 2, 1, 1, 1 and 4 into the queue, frequency of 1 is 4 and that of 4 is 1. Since 5 and 3 are not there in the queue we output -1 for them.
Your Task:
Your task is to complete the functions insert() and findFrequency() which inserts the element into the queue and find the count of occurences of element in the queue respectively.

Expected Time Complexity: O(N*M)
Expected Space Complexity: O(N)

Constraints:
1 <= N <= 103
1 <= M <= 103
1 <= Elements of Queue <= 106
