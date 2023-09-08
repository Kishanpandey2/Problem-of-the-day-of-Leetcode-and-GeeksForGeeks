
class Solution
{
   int idx ;
    Node binaryTreeToBST(Node root)
    {
        if(root == null)return null;
        
        
       List<Integer>al = new ArrayList<>() ;
       inOrder(root,al);
       
       Collections.sort(al);
       idx = 0 ;
       
       rePlace(root,al);
       
       return root;
    }
    void inOrder(Node root,  List<Integer>al)
    {
        if(root == null)return  ;
        else{
            inOrder(root.left,al) ;
            al.add(root.data);
            inOrder(root.right,al) ;
        }
    }
    
     void rePlace(Node root,  List<Integer>al)
    {
        if(root == null)return  ;
        else{
            rePlace(root.left,al) ;
          root.data = al.get(idx);
            idx++;
            rePlace(root.right,al) ;
        }
    }
}
 
