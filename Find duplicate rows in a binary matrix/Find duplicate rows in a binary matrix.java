
class Solution
{
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
       Set<String>st = new HashSet<>() ;
       
       ArrayList<Integer>ans = new ArrayList<>() ;
       
       
       for(int  r=0 ;r< matrix.length;r++)
       {
          StringBuilder sb = new StringBuilder() ;
          for(int c = 0 ;c<matrix[0].length;c++)
         sb.append(matrix[r][c]) ;
         
         String temp = sb.toString();
          
          if(st.contains(temp))
          ans.add(r);
          else
          st.add(temp);
           
       }
       
       return ans;
    }
}
