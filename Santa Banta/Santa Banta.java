
class Complete{
    static int cnt;
    static ArrayList<Integer> primes = new ArrayList<>();;
    
    // Function for finding maximum and value pair
    public static int helpSanta (int n, int m, int g[][]) 
    {
       ArrayList<ArrayList<Integer>> adj =new ArrayList<ArrayList<Integer>>();
       
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<Integer>()); 
        }
        //add edge
        for(int i=0;i<m;i++)
        {
            int u = g[i][0]; int v = g[i][1];
            adj.get(u).add(v); 
		    adj.get(v).add(u); 
        }

        
        boolean vis[]=new boolean[n+1];
        int max = 0;
        for(int i=1;i<=n;i++)
        {
            if(vis[i]==false){
                cnt=0;  // global variable since i want to access it across the functions
                DFS(adj,i,vis);
                max=Math.max(max,cnt);
            }
        }
        if(max==1) return -1; //In case no of connections is zero, print "-1". 
        return primes.get(max-1);
    }
	static void DFS(ArrayList<ArrayList<Integer>> adj,int s, boolean[] visited) 
	{ 
    	visited[s]=true;
        cnt++;
        
        for(int u:adj.get(s)){
            if(visited[u]==false)
                DFS(adj,u,visited);
        } 
	} 
    
     static void precompute () { //sieve 
        //Complete the function
        
        int N=1000000;
        boolean v[]=new boolean[N+1];
        Arrays.fill(v,true);
        for(int i=2;i*i<=N;i++){
            if(v[i]){
                for(int j=i*i;j<=N;j+=i){
                    v[j]=false;
                }
            }
        }
        for(int i=2;i<=N;i++){
            if(v[i]){
                primes.add(i);
            }
        }
    }
    
    
}
