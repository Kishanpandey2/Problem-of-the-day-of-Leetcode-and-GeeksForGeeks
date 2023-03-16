class Solution {
    TreeNode buildTree(int []postorder,int psi,int pei , int []inorder , int isi,int iei ){
        if(isi >iei)
        return null ;

        TreeNode node = new TreeNode(postorder[pei]) ;

        int index = isi ;

        while(inorder[index] != postorder[pei])
        index++ ;

        int tnel = index - isi ;

        node.left = buildTree(postorder , psi , psi+tnel-1 , inorder , isi , index-1) ;
        node.right = buildTree(postorder , psi+tnel , pei -1 , inorder , index+1 , iei) ;

        return node ;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int len = inorder.length ;

        return buildTree(postorder,0,len-1,inorder,0,len-1) ;
    }
}
