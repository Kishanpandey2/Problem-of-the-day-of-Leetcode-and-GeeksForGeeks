
/* Tree node structure
class Node
{
    int data;
    Node left;
    Node right;

        Node(int value)
    {
        data = value;
        left = null;
        right = null;
    }
}*/


class GfG
{
    
    Node buildTree(int in[], int post[], int n) {
        if(in.length != post.length)return null;
        Map<Integer,Integer>map = new HashMap<>() ;
        
        
        for(int i= 0 ;i<n;i++)
        map.put(in[i],i);
        
        return help(in,0,n-1,post,0,n-1,map) ;
    }
    
    Node help(int []in,int is,int ie,int []post,int ps,int pe,Map<Integer,Integer>map){
        if(is > ie || ps>pe )return null ;
        
        Node root = new Node(post[pe]) ;
        
        int inroot = map.get(post[pe]) ;
        int left = inroot - is ;
        
        root.left = help(in,is,inroot-1,post,ps,ps+left-1,map) ;
        root.right = help(in,inroot+1,ie,post,ps+left,pe-1,map) ;
        
        return root ;
    }
}
