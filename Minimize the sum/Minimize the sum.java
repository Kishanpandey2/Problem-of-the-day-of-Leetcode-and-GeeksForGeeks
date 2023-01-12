class Solution {
    long minimizeSum(int N, int arr[]) {
PriorityQueue<Integer>q=new PriorityQueue<>();
for(int i:arr)
{
    q.add(i);
}
if(N==1)
return 0;
else if(N==2)
return arr[0]+arr[1];
int ans=0;
while (q.size()>1)
{int a =q.poll();
int b =q.poll(); 
ans += (a+b);
q.add(a+b);
}
return ans;

    }
}

Expected Time Complexity: O(N * log(N))
Expected Auxiliary Space: O(N)
