class Solution {
    int ans = 0 ;
    void help(int[][] request, int []indegree,int n, int index,int count){
        if(index == request.length){
            for(int i = 0 ;i<n;i++)
            {
                if(indegree[i]!=0)
                return ;
            }
            ans = Math.max(ans,count);
            return ;
        }
        indegree[request[index][0]]--;
        indegree[request[index][1]]++;
         
         help(request,indegree,n,index+1,count+1);
         
         indegree[request[index][0]]++;
         indegree[request[index][1]]--;
         
         help(request,indegree,n,index+1,count);
    }
    public int maximumRequests(int n, int[][] requests) {
        int []indegree = new int[n] ;
        help(requests,indegree,n,0,0);
        return ans ;
    }
}
