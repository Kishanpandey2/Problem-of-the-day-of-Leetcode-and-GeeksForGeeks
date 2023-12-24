Buy Maximum Stocks if i stocks can be bought on i-th day  =>
--------------------------------------------------------


In a stock market, there is a product with its infinite stocks. The stock prices are given for N days, where price[i] denotes the price of the stock on the ith day.
There is a rule that a customer can buy at most i stock on the ith day.
If the customer has an amount of k amount of money initially. The task is to find out the maximum number of stocks a customer can buy. 

Example 1:

Input:
price = [10,7,19]
k = 45
Output: 
4
Explanation: 
A customer purchases 1 stock on day 1, 2 stocks on day 2 and 1 stock on day 3 for 10, 7 * 2 = 14 and 19 respectively. Hence, total amount is 10 + 14 + 19 = 43 and number of stocks purchased is 4.
Example 2:

Input: 
price = [7,10,4]
k = 100
Output: 
6
Explanation:
Buy on all 3 days.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function buyMaximumProducts() which takes an array price and an integer k and returns an integer as output.

Expected Time Complexity: O(NlogN)
Expected Auxiliary Space: O(N)

Constraints:
1 <= N <= 104
1 <= price[i] <= 104
1 <= k <= 104
