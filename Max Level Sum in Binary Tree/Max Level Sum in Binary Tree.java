class Solution {
    public int maxLevelSum(Node root) {
         Queue<Node>q = new LinkedList<>() ;
         int sum  ;
         int maxAns = Integer.MIN_VALUE ;
         q.offer(root) ;
         while(!q.isEmpty()){
             int n  = q.size() ;
             sum = 0 ;
             
             for(int i = 0 ;i<n ;i++){
                 Node curr = q.poll() ;
                 if(curr.left!=null)
                 q.add(curr.left) ;
                 if(curr.right!=null)
                 q.add(curr.right) ;
                 sum+=curr.data ;
             }
             maxAns = Math.max(maxAns ,sum) ;
             
         }
         return maxAns ;
    }
}
