/*Tree Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} 
*/

class Solution
{
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum)
    {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>() ;
        ArrayList<Integer>temp = new ArrayList<>();
        dfs(root,sum , 0 , temp, ans) ;
        return ans ;
    }
    public static void dfs(Node root , int sum , int cur ,  ArrayList<Integer>temp , ArrayList<ArrayList<Integer>>ans){
        if(root == null)return ;
        
        cur += root.data ;
        temp.add(root.data);
        
        if(cur == sum)
        ans.add(new ArrayList(temp)) ;
        
        dfs(root.left,sum , cur,temp,ans);
        dfs(root.right,sum , cur,temp,ans);
        
        temp.remove(temp.size()-1) ;
    }
}
