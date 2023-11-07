
class Solution
{
   
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
       int upper = 0 , lower = 0 ;
       
       for(int i = 0 ;i<n;i++){
           for(int j = 0 ;j<n;j++)
           {
               if(i<=j)
               upper += matrix[i][j] ;
               
               if(i>=j)
               lower+= matrix[i][j] ;
           }
           
       }
       
        ArrayList<Integer>ans = new ArrayList<>() ;
           
           ans.add(upper) ;
           ans.add(lower) ;
           
           return ans;
    }
}
