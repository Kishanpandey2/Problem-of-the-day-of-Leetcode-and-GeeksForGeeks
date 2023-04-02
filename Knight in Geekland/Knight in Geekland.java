class Pair{
    int a; int b;
    Pair(int a, int b){
        this.a=a; this.b=b;
    }
}
 
class Solution{
    public int knightInGeekland(int arr[][], int start_x, int start_y){

        // Code Here.
        int r= arr.length; int c=arr[0].length;
    int dx[] = {-2, -1, 1, 2, 2, 1, -1, -2};
    int dy[] = {1,   2, 2, 1, -1, -2, -2, -1};
    
     
    boolean vis[][] = new boolean[r][c];
    List<Integer> al = new ArrayList<>();
    
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(start_x, start_y));
        vis[start_x][start_y]=true;
        while(!q.isEmpty())
        {
            int size= q.size();
            int curr_lev_pts =0;
        
            for(int i=0; i<size; i++)
            {
             Pair curr= q.poll();
             int x = curr.a; int y= curr.b;
             curr_lev_pts += arr[x][y];
             //vis all its 8  moves;
                 for(int j=0 ;j<8; j++)
                 {
                     int n_x = x+dx[j]; 
                     int n_y = y+dy[j];
                     if(is_Safe(n_x, n_y, r,c) && !vis[n_x][n_y])
                     {
                         vis[n_x][n_y] = true;
                         q.add(new Pair(n_x, n_y));
                     }
                 }
            }
            al.add(curr_lev_pts);
            
        }
       
         int max= Integer.MIN_VALUE; int ans=-1;
         for(int i = al.size() - 1; i >=0; i--)
         {
            if(al.get(i) + i < al.size())
                al.set(i, al.get(i) + al.get(i + al.get(i)));
        }
        
         for(int i = 0; i < al.size(); i++)
         {
            if(al.get(i) > max){
                max = al.get(i);
                ans = i;
            }
        }
         return ans;
    }
      boolean is_Safe(int i, int j, int r, int c)
        {
            if(i<0 || i>=r || j<0 || j>=c)
            return false;
            return true;
        }
}     
