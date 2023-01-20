class Solution{
    public int maxWeightCell(int N, int Edge[]){
       int []weight = new int[N] ;
       for(int i=0 ;i<N;i++)
       {
           if(Edge[i]!=-1)
           weight[Edge[i]]+=i ;
       }
       int maxWeight = -1 , maxWtIndex = -1 ;
       for(int i = 0 ;i<N;i++)
       {
           if(weight[i]>=maxWeight)
           {
               maxWeight = weight[i] ;
               maxWtIndex=i ;
           }
       }
        return maxWtIndex ;
    }
}


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
