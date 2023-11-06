
class Solution{
    static List<Integer> matrixSum(int n, int m, int mat[][], int q, int queries[][])
    {
         int []dx1 =  { -1,-1,-1,0,0,1,1,1} ;
         int []dy1 =  { -1,0,1,-1,1,-1,0,1} ;
         
         int []dx2 = {-2,-2,-2,-2,-2,-1,-1,0,0,1,1,2,2,2,2,2}  ;
         int []dy2 = {-2,-1,0,1,2,-2,2,-2,2,-2,2,-2,-1,0,1,2}  ;
         
         List<Integer>ans = new ArrayList<>() ;
         
         for(int t = 0 ;t<q;t++){
             int sum = 0 ;
             int i = queries[t][1] , j = queries[t][2] ;
             if(queries[t][0] == 1){
                 for(int  k = 0;k<dx1.length ;k++)
                 {
                     int n_i = i + dx1[k] ;
                     int n_j = j + dy1[k] ;
                      if(isSafe(n_i,n_j,n,m))
                      sum += mat[n_i][n_j] ;
                 }
             }
             else
             {
                 for(int  k = 0;k<dx2.length ;k++)
                 {
                     int n_i = i + dx2[k] ;
                     int n_j = j + dy2[k] ;
                      if(isSafe(n_i,n_j,n,m))
                      sum += mat[n_i][n_j] ;
                 }
             }
             ans.add(sum ) ;
         }
         
         return ans;
    }
    
    static boolean isSafe(int i,int j,int n,int m){
        return (i >=0 && i<n && j>=0 && j<m) ;
    }
}
