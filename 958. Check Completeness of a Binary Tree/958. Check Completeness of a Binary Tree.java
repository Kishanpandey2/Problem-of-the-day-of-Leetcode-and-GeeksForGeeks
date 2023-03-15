class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode > q = new LinkedList<>() ;
        boolean flag = false ;

        q.offer(root) ;

        while(!q.isEmpty())
            {
                TreeNode temp = q.poll() ;
                if(temp== null)
                flag = true ;
                else
                {
                    if(flag) return false ;

                    q.offer(temp.left) ;
                    q.offer(temp.right) ;
                }
            }

            return true ;
    }
}
