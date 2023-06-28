class Solution {
  public static int maxDepth(Node root) {
    if(root == null)
    return 0 ;
    return Math.max(maxDepth(root.left),maxDepth(root.right))+1;

  }
}
     
