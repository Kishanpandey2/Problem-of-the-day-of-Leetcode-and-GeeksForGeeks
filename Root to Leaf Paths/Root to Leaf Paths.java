

/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    static ArrayList<ArrayList<Integer>>ans = null;
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ans = new ArrayList<>() ;
        
        ArrayList<Integer>al = new ArrayList<>();
        help(root,al);
        return ans;
    }
    
    public static void help(Node root, ArrayList<Integer>al)
    {
        if(root == null)return ;
        
         al.add(root.data) ;
         
        if( (root.left == null) && (root.right == null) )
        {
            ans.add(new ArrayList<>(al) ) ;
            al.remove(al.size()-1);
            return ;
        }
        
       
        
        if(root.left != null)
        help(root.left , al);
        
        if(root.right != null)
        help(root.right , al);
        
        
        al.remove(al.size()-1);
    }
}
        
