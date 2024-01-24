/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int result = 0 ;
    int []freq  ;
    public int pseudoPalindromicPaths (TreeNode root) {
        freq = new int[10] ;

        help(root) ;

        return result ;
    }

    void help(TreeNode root)
    {
        if(root == null)return ;

        freq[root.val]++ ;

        if(root.left == null && root.right == null)
        {
            if(isPalindrome())result++;
        }
    else
    {
        help(root.left) ;
        help(root.right) ;

    }

        freq[root.val]-- ;
    }

    boolean isPalindrome(){
        int odd = 0 ;

        for(int i : freq)
        if(i%2!= 0)odd++;

        return odd>1?false : true;
    }
}
