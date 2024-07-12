
/*
// A Binary Tree node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    /*you are required to complete this function */
    boolean hasPathSum(Node root, int target) {
        return help(root,target,0);
    }
    
    boolean help(Node root,int target,int sum ){
        if(root == null)return false ;
        
        sum += root.data;
        if(root.left == null && root.right== null && sum == target)return true;
        
        
        return (help(root.left,target,sum)|| help(root.right,target,sum)) ;
    }
}
