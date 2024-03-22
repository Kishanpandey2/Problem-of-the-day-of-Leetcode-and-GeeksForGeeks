
/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class Tree {
    public static ArrayList <Integer>  ans ;
    public static ArrayList <Integer> diagonalSum(Node root) 
    {
        ans = new ArrayList<>() ;
        
        dfs(root,0) ;
        
        return ans;
    }
    
    public static void dfs(Node root,int level){
        if(root == null)return ;
        
        if(ans.size() <= level) 
        ans.add(root.data) ;
        else
        ans.set(level,ans.get(level)+root.data) ;
        
        
        dfs(root.right,level) ;
        dfs(root.left,level+1) ;
    }
}
