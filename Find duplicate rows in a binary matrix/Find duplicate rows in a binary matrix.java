
class Solution
{
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
       Set<Integer>st = new HashSet<>() ;
       
       ArrayList<Integer>ans = new ArrayList<>() ;
       
       
       for(int  r=0 ;r< matrix.length;r++)
       {
          int deci = 0 ;
          for(int c = 0 ;c<matrix[0].length;c++)
          deci += matrix[r][c]*Math.pow(2,c) ;
          
          if(st.contains(deci))
          ans.add(r);
          else
          st.add(deci);
           
       }
       
       return ans;
    }
}
