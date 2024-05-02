
/*Complete the given function
Node is as follows:
class Tree{
    int data;
    Tree left,right;
    Tree(int d){
        data=d;
        left=right=null;
    }
}*/

class Tree {
     
    public ArrayList<Integer> serialize(Node root) {
     ArrayList<Integer> al = new ArrayList<>() ;
     
     if(root == null)al.add(-1) ;
     
     Queue<Node>q = new LinkedList<>() ;
     
     q.add(root) ;
     
     while(!q.isEmpty()){
         Node node = q.poll() ;
         
         if(node == null)
         {
             al.add(-1) ; continue ;
         }
         
         al.add(node.data);
         q.add(node.left);
         q.add(node.right);
     }
     
     return al ;
    }

     
    public Node deSerialize(ArrayList<Integer> A) {
         Queue<Node>q = new LinkedList<>() ;
         
         Node root = new Node(A.get(0)) ;
         q.add(root);
         
         for(int i = 1;i<A.size();i++){
             Node parent= q.poll() ;
             if(A.get(i)!= -1)
             {
                 Node left= new Node(A.get(i)) ;
                 parent.left = left; 
                 q.add(left);
             }
             if(A.get(++i)!= -1)
             {
                 Node right= new Node(A.get(i)) ;
                 parent.right = right; 
                 q.add(right);
             }
         }
         
         return root;
         
         
    }
};
