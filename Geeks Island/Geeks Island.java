class Solution{
	int water_flow(int [][] arr, int r, int c) {
	boolean ind[][] = new boolean[r][c];
		boolean arab[][] = new boolean[r][c];
		
//call dfs for indian  - 1st row and 1st col
        for(int i=0; i<c; i++) dfs(arr, ind, 0, i, r,c); // first row
		for(int i=0; i<r; i++) dfs(arr, ind, i,0, r,c); // first col
//call dfs fro arab -  last col and last row
        for(int i=0; i<r; i++) dfs(arr, arab, i, c-1, r,c); // last col
		for(int i=0; i<c; i++) dfs(arr, arab, r-1, i, r,c); // last row

//ind and arab array has true 
    int ans=0;
		for(int i=0 ;i<r; i++)
		{
		    for(int j=0; j<c; j++)
		    if(ind[i][j] && arab[i][j])
		    ans++;
		}
		return ans;
	}
	void dfs(int [][]arr,boolean [][]vis , int i,int j ,int r,int c){
	     if(i<0 || i>=r || j<0 || j>=c || vis[i][j]) return; // stop dfs
	    
	      vis[i][j] = true;
	    //recur in 4 dir
	       if(j+1<c && !vis[i][j+1] && arr[i][j+1] >= arr[i][j]) //right
	    dfs(arr, vis, i,j+1, r, c);
	    
	    if(i+1<r && !vis[i+1][j] && arr[i+1][j] >= arr[i][j] ) // down
	     dfs(arr, vis, i+1,j, r, c);
	     
	     if(j-1>=0 && !vis[i][j-1] && arr[i][j-1] >= arr[i][j] ) // left
	     dfs(arr, vis, i,j-1, r, c);
	     
	     if(i-1>=0 && !vis[i-1][j] && arr[i-1][j] >= arr[i][j] ) // top
	     dfs(arr, vis, i-1,j, r, c);
	}
}
