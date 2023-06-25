class GfG
{
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
         ArrayList<ArrayList<Integer>> ans = new ArrayList<>() ;
         HashSet<ArrayList<Integer>> set = new LinkedHashSet<>();
         for(int i = 0 ;i<r;i++)
         {
             ArrayList<Integer>cur = new ArrayList<>() ;
             for(int j = 0 ;j<c;j++)
             cur.add(a[i][j]) ;
             
             if(!set.contains(cur))
             set.add(cur);
         }
         for(ArrayList<Integer> x:set)
         ans.add(x) ;
         return ans;
    }
}
