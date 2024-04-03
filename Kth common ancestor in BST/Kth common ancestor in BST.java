class Solution {
    
    Node lca(Node root,int x,int y){
        if(root == null)return null ;
        
         if(root.data== x || root.data == y)return root;
        else if(root.data<x && root.data<y)
        return lca(root.right,x,y);
         else if(root.data>x && root.data>y)
       return lca(root.left,x,y);
       else
         return root;
    }
    void help(Node root,Node lca,List<Integer>ans){
        ans.add(root.data);
        if(root.data == lca.data)return ;
       else if(root.data < lca.data)help(root.right,lca,ans);
        else help(root.left,lca,ans);
         return ;
    }
    public int kthCommonAncestor(Node root, int k, int x, int y) {
        List<Integer>ans =new ArrayList<>() ;
        
        Node lowCA = lca(root,x,y);
        help(root,lowCA,ans);
        
        if(ans.size()<k)return -1;
        
        return ans.get(ans.size()-k);
        
    }
    
}
