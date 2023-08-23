
class Solution
{
    public int[][] searchWord(char[][] grid, String word)
    {
          List<List<Integer>> al = new ArrayList<>() ;
          int m = grid.length ;
          int n = grid[0].length ;
          
          int []dx = {-1,-1,-1,0,0,1,1,1};
          int []dy = {-1,0,1,-1,1,-1,0,1} ;
          
          for(int i = 0 ;i<m;i++)
          {
              for(int  j = 0 ;j<n;j++)
              {
                  if(grid[i][j]== word.charAt(0)){
                      
                      for(int k = 0 ;k<8;k++)
                      {
                          if(dfs(m,n,grid,0,i,j,word, dx[k],dy[k])){
                          List<Integer>pos = new ArrayList<>() ;
                              pos.add(i) ;
                              pos.add(j) ;
                              al.add(pos) ;
                              break;
                          }
                      }
                  }
              }
          }
          
          
          
          int [][]ans = new int[al.size()][2] ;
          int k = 0 ;
          
          for(List<Integer> i : al){
              ans[k][0] = i.get(0) ;
              ans[k][1] = i.get(1) ;
              k++;
          }
          
          return ans;
    }
    
    private boolean dfs(int m,int n ,char [][]grid,int ind ,int i,int j , String word,int nei_x,int nei_y){
        
        if(ind == word.length())
        return true ;
        
        if(i>=0 && i<m && j>=0 && j<n && grid[i][j]==word.charAt(ind)){
            return dfs(m,n,grid,ind+1,i+nei_x,j+nei_y,word,nei_x,nei_y);
        }
        return false;
    }
}
