class Solution
{
    Node target1 ;
    long res =0 ;
    long verticallyDownBST(Node root,int target)
    {
        while(root!=null){
            if(root.data<target)
            root = root.right ;
            else if(root.data >target)
            root= root.left ;
            else
            break ;
        }
        if(root==null)
        return -1 ;
        target1 = root ;
        inorder(root,0) ;
        return res ;
    }
    void inorder(Node root,int dir){
        if(root!=null)
        {
         inorder(root.left,dir-1) ; 
         inorder(root.right,dir+1) ;
         if(root !=target1 && dir ==0)
         res += root.data ;
        }
    }
}
