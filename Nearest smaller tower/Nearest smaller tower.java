
class Solution{
	int [] nearestSmallestTower(int [] arr){
	int n = arr.length;
        Stack<Integer> left = new Stack<>();
        Stack<Integer> right = new Stack<>();
        int [] res = new int[n];
        Arrays.fill(res, -1);

        for (int i = 0; i < n; i++)
        {
            while (!left.empty() && arr[left.peek()] >= arr[i])
            {
                left.pop();
            }

            if (!left.empty())
            {
                res[i] = left.peek();
            }

            left.push(i);
        }

        for (int i = n - 1; i >= 0; i--)
        {
            while (!right.empty() && arr[right.peek()] >= arr[i])
            {
                right.pop();
            }

            if (!right.empty())
            {
                     
                if (res[i] != -1)
                {
                    
                    if (Math.abs(res[i] - i) == Math.abs(right.peek() - i))
                    {
                        if (arr[res[i]] > arr[right.peek()])
                            res[i] = right.peek();
                    }
                     
                    else if (Math.abs(res[i] - i) > Math.abs(right.peek() - i))
                        res[i] = right.peek();
                }
                
                else
                    res[i] = right.peek();
            }

            right.push(i);
        }

        return res;
    }
}
