class Solution {
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer>al =new ArrayList<>() ;

        help1(root,al);
        return help2(al,0,al.size()-1);
    }
    void help1(TreeNode root,ArrayList<Integer>al){
        if(root!= null){
            help1(root.left,al);
            al.add(root.val) ;
            help1(root.right,al);
        }
    }

    TreeNode help2(ArrayList<Integer>al,int st,int end ){
            
            if(st>end)return null;
            int mid = st+(end-st)/2 ;

            TreeNode root = new TreeNode(al.get(mid));
            root.left = help2(al,st,mid-1);
            root.right = help2(al,mid+1,end);
            return root;
    }
}
