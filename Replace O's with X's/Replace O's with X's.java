
class Solution{
    static char[][] fill(int n, int m, char a[][])
    {
        for(int i = 0;i < n;i++){
		    if(a[i][0] == 'O') //1st col
			    dfs(a, i, 0, 'O', '-', n, m);
			    
			 if(a[i][m-1] == 'O') //last col
			    dfs(a, i, m-1, 'O', '-', n, m);
		}

			    
		
		for(int i = 0;i < m;i++){
			if(a[0][i] == 'O') //1st row
			    dfs(a, 0, i, 'O', '-', n, m);
			 if(a[n-1][i] == 'O')  	// last row
			    dfs(a, n-1, i, 'O', '-', n, m);
		}
		
       for(int i = 0;i < n;i++)
			for(int j = 0;j < m;j++)
				if(a[i][j] == 'O')
				    a[i][j] = 'X';
				    
				    //change - to X;
	    for(int i = 0;i < n;i++)
			for(int j = 0;j < m;j++)
				if(a[i][j] == '-')
				    a[i][j] = 'O';
       
       return a;
    }
    
    
    private static void dfs(char [][]a ,int x,int y , char prevC , char newC,int n,int m){
        if(x<0|| x>=n || y<0 || y>=m )return ;
        
        if(a[x][y]!=prevC)return ;
        
        a[x][y] =newC ;
        
        dfs(a,x+1,y,prevC,newC,n,m) ;
         dfs(a,x-1,y,prevC,newC,n,m) ;
         dfs(a,x,y+1,prevC,newC,n,m) ;
         dfs(a,x,y-1,prevC,newC,n,m) ;
        
    }
}
