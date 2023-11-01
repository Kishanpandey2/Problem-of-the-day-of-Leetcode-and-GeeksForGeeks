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
    TreeNode prev = null ;
    int cnt =1,max = 0 ;

    private void inOrder(TreeNode node , ArrayList<Integer>list){
        if(node == null)return ;

        inOrder(node.left, list) ;

        if(prev != null)
        {
            if(node.val == prev.val)cnt++ ;
        
        else cnt = 1 ;
        }
        if(cnt>max)
        {
            list.clear() ;
            list.add(node.val) ;
            max = cnt ;
        }
        else if(cnt == max)
        list.add(node.val ) ;

        prev = node;

        inOrder(node.right ,list);

    }
    public int[] findMode(TreeNode root) {
        ArrayList<Integer>list = new ArrayList<>() ;
        inOrder(root,list);

        int []ans = new int[list.size()] ;
        for(int i=0 ;i<ans.length;i++ ) 
        ans[i] = list.get(i) ;

        return ans ;
    }
}
