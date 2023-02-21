class Pair{
     int  first ,second ;
    public Pair(int first ,int second ){
        this.first = first ;
        this.second = second ;
    }
}
class Solution
{
	public static int minIteration(int N, int M, int x, int y){
		int [][]matrix = new int[N][M] ;
		 matrix[x-1][y-1] = 1 ;
		Queue<Pair>q = new LinkedList<>() ;
		q.add(new Pair(x-1,y-1)) ;
		
		int level = 0;
		
		while(!q.isEmpty()){
		    int qsize = q.size();
		    while(qsize-- > 0){
		        Pair p = q.peek() ;
		        q.remove() ;
		        int i = p.first ;
		        int j = p.second ;
		        
		        if((i+1<N) && matrix[i+1][j]==0)
		        {
		            matrix[i+1][j] = 1 ;
		            q.add(new Pair(i+1,j));
		        }
		        
		         if((j+1<M) && matrix[i][j+1]==0)
		        {
		            matrix[i][j+1] = 1 ;
		            q.add(new Pair(i,j+1));
		        }
		        
		         if((i-1>=0) && matrix[i-1][j]==0)
		        {
		            matrix[i-1][j] = 1 ;
		            q.add(new Pair(i-1,j));
		        }
		        
		        if((j-1>=0) && matrix[i][j-1]==0)
		        {
		            matrix[i][j-1] = 1 ;
		            q.add(new Pair(i,j-1));
		        }
		    }
		    level++;
		}
		return level-1;
		
	}
}
