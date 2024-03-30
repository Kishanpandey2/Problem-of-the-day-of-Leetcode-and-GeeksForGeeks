

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
}
*/
class Solution {
    
    int min = Integer.MAX_VALUE ;
    
    int minValue(Node root) {
        if(root == null)return min ;
        
        min = Math.min(min,root.data) ;
        
        if(root.left != null)
        minValue(root.left);
        if(root.right != null)
        minValue(root.right);
        
        return min;
    }
    
}
