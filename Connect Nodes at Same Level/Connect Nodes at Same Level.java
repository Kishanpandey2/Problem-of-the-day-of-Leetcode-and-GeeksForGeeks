class Solution {
    public void connect(Node root) {
    
        Node prev;
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()) {
            int size = q.size();// size first one
            prev = null;
            
            while(size>0) {
              root = q.remove(); // remove the element
              if(prev!=null) { // check the node had left element or not
                  prev.nextRight = root;
              }
              prev = root;
              
              if(root.left!=null) 
              q.add(root.left);
              if(root.right!=null)
              q.add(root.right);
              size--;
            }
        }
        
    }
}
