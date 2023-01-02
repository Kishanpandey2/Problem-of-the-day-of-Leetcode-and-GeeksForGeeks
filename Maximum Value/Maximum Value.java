class Solution {
    ArrayList<Integer> maximumValue(Node node) {
       //code here
       ArrayList<Integer> res = new ArrayList<>() ;
       Queue<Node > q = new LinkedList<Node>() ;
       q.add(node) ;
       while(!q.isEmpty())
       {
           int len = q.size();
           int current_max = Integer.MIN_VALUE ;
           for(int i = 0 ;i<len ;i++)
           {
               
               Node temp = q.poll() ;
               current_max = Math.max(current_max,temp.data);
               if(temp.left!=null)
               q.add(temp.left);
               if(temp.right!=null)
               q.add(temp.right);
           }
           res.add(current_max);
       }
       return res;
    }
}

Expected Time Complexity: O(N), where N is the number of nodes.
Expected Auxiliary Space: O(H), where H is the height of binary tree.
