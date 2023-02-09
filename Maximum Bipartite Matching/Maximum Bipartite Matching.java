class Solution
{
    public int maximumMatch(int[][] G)
    {
     int row = G.length ;
     int col = G[0].length ;
     int res = fun(G,row,col) ;
     return res ;
    }
    int fun(int [][]G,int row,int col){
        int []match= new int[col] ;
        for(int i = 0 ;i<col ;i++){
            match[i] = -1 ;
        }
        int res = 0 ;
        for(int u = 0 ;u<row ;u++){
            boolean []vis = new boolean[col] ;
            if(bpm(G,u,vis,match,row,col))
            res++ ;
        }
        return res ;
    }
    boolean bpm(int [][]G,int u, boolean []vis , int []match,int row,int col){
        for(int v = 0 ;v<col;v++){
            if(G[u][v]==1 && !vis[v])
            {
                vis[v]= true ;
                if(match[v]<0 || bpm(G,match[v],vis,match,row,col)){
                    match[v]= u ;
                    return true ;
                } 
            }
            
        }
        return false ;
    }
    
}
