class Pair{

    int node ;

    int dist ;

    Pair(int node , int dist){

        this.node = node;

        this.dist = dist;

    }

}

 

class Solution {

    static int shortestPath(int n, int m, int a, int b, ArrayList<ArrayList<Integer>> edges) {

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        

        ArrayList<ArrayList<Integer>> curved = new ArrayList<>();

        

        for(int i =0 ;i<=n ; i++){

            adj.add(new ArrayList<Pair>());

        }

        

        for(ArrayList<Integer> x : edges){

            adj.get(x.get(0)).add(new Pair(x.get(1) , x.get(2)));

            adj.get(x.get(1)).add(new Pair(x.get(0) , x.get(2)));

        

            ArrayList<Integer> temp = new ArrayList<>();

            temp.add(x.get(0));

            temp.add(x.get(1));

            temp.add(x.get(3));

                

            curved.add(temp);    

        }

        

        int distAtoB [] = Dijkstra(adj , a , n);

        int distBtoA [] = Dijkstra(adj , b , n);

        

        int ans = distAtoB[b];

        

        for(int i =0 ;i<m ;i++){

            int u = curved.get(i).get(0);

            int v = curved.get(i).get(1);

            int cw = curved.get(i).get(2);

            

            ans = Math.min(ans , cw + distAtoB[u] + distBtoA[v]);

            ans = Math.min(ans , cw + distAtoB[v] + distBtoA[u]);

        }

        

        if(ans>= 1000000007) return -1;

        

        return ans;

        

        

    }

    

    static int [] Dijkstra(ArrayList<ArrayList<Pair>> adj  , int s , int n){

        PriorityQueue<Pair> pq = new PriorityQueue<>((x ,y)-> x.dist - y.dist);

        

        int dist [] = new int[n+1];

        

        Arrays.fill(dist , 1000000007);

        

        dist[s] = 0;

        pq.add(new Pair(s , 0));

        

        while(!pq.isEmpty()){

            Pair z = pq.poll();

            

            int currdist = z.dist;

            int currn = z.node;

            

            for(int i =0 ;i<adj.get(currn).size();i++){

                int newdist = currdist + adj.get(currn).get(i).dist ;

                int newn = adj.get(currn).get(i).node;

                

                if(newdist < dist[newn]){

                    dist[newn] = newdist;

                    pq.add(new Pair(newn , dist[newn]));

                }

            }

        }

        return dist;

    }

};
