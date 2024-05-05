class Pair{
    int hd  ;
    Node node ;
    Pair(Node node,int hd){
        this.node = node ;
        this.hd = hd;
    }
}
class Solution{
    public ArrayList <Integer> verticalSum(Node root) {
         Map<Integer,ArrayList<Integer>>map =new TreeMap<>() ;
         
         Queue<Pair>q  = new LinkedList<>() ;
         q.add(new Pair(root,0)) ;
         
         while(!q.isEmpty()){
             Pair cur = q.poll() ;
             
             if(map.containsKey(cur.hd))
             map.get(cur.hd).add(cur.node.data);
             else
             {
                 ArrayList<Integer>temp = new ArrayList<>() ;
                 temp.add(cur.node.data) ;
                 map.put(cur.hd,temp) ;
             }
             
             if(cur.node.left != null){
                 q.add(new Pair(cur.node.left, cur.hd-1));
             }
             
             if(cur.node.right != null)
             q.add(new Pair(cur.node.right, cur.hd+1));
         }
         
         ArrayList<Integer>ans = new ArrayList<>();
         for(ArrayList<Integer>al : map.values()) 
         {
             int sum = 0;
             for(int i : al)
             sum += i ;
             
             ans.add(sum);
         }
         
        
         
         return ans;
    }
}
