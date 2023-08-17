class Solution {
    class Node{
        int first , second , third ;
        Node(int first, int second , int third){
            this.first = first ;
            this.second = second ;
            this.third  = third;
        }
    }
    public int[][] updateMatrix(int[][] grid) {
         int n = grid.length  ;
       int m = grid[0].length ;
       
       int [][]vis = new int[n][m] ;
       int [][]dis = new int[n][m] ;
       
       Queue<Node>q = new LinkedList<>() ;
       for(int i = 0 ;i<n;i++)
       {
           for(int j = 0 ;j<m;j++)
           {
               if(grid[i][j] == 0)
               {
                   q.offer(new Node(i,j,0)) ;
                   vis[i][j] = 1;
               }
               else
               {
                   vis[i][j] = 0;
               }
           }
       }
       
       int delRow[] = { -1, 0 , 1, 0} ;
        int delCol[] = {  0 , 1, 0,-1} ;
        
        
       while(!q.isEmpty()){
           int row = q.peek().first ;
           int col = q.peek().second;
           int step = q.peek().third ;
           
           q.poll() ;
           dis[row][col] = step;
           
           for(int i = 0;i<4;i++)
           {
               int nrow = row+delRow[i];
               int ncol = col+delCol[i];
               
               if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0)
               {
                   vis[nrow][ncol] = 1 ;
                   q.offer(new Node(nrow,ncol,step+1));
               }
           }
       }
       
       return dis;
    }
}
