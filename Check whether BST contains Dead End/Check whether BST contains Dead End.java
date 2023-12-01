
/*class Node {
        int data;
        Node left, right;
 
        Node(int item) {
            data = item;
            left = right = null;
        }
    }*/

//Function should return true if a deadEnd is found in the bst otherwise return false.
class Solution
{
    public static boolean isDeadEnd(Node root)
    {
      return help(root, 1, Integer.MAX_VALUE ) ;
        
    }
    public static boolean help(Node root, int min , int max){
        if(root == null )return false ;
        
        if(min == max)return true ;
        
        return help(root.left,min,root.data - 1) || help(root.right,root.data + 1,max)  ;
    }
}
