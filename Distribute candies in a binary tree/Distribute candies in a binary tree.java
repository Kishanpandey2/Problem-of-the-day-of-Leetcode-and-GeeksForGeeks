
/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}*/


class Solution
{
   static  int noMoves;
    public static int distributeCandy(Node root)
    {
        noMoves = 0 ;
        help(root) ;
        
        return noMoves;
    }
    
    public static int help(Node root){
        if(root ==null)return 0 ;
        
        int left = help(root.left);
        int right = help(root.right);
        
        noMoves +=Math.abs(left)+Math.abs(right);
        
        return root.data+left+right-1;
    }
}
