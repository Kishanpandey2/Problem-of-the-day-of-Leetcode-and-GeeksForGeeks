class Solution {
    long fuel ;
    int seats  ;
    public long minimumFuelCost(int[][] roads, int seats) {
        List<Integer>[]graph = new List[roads.length+1] ;
        for(int i = 0 ;i<=roads.length ;i++)
        graph[i] =new ArrayList<>() ;
        for(int []n:roads){
            int t1 = n[0] ;
            int t2 = n[1] ;
            graph[t1].add(t2) ;
            graph[t2].add(t1) ;
        }
        this.seats = seats ;
        dfs(graph,0,-1) ;
        return fuel;
    }
    int dfs(   List<Integer>[]graph,int current_city , int prev_city){
        int passenger = 1 ;
        for(int next_city : graph[current_city]){
            if(next_city == prev_city)
            continue ;
            passenger +=  dfs(graph, next_city,current_city) ;
        }
        if(current_city!=0)
        fuel += (long) Math.ceil((double)passenger/this.seats);
        return passenger ;
    }
    
}
