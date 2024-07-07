
/*class Node of the binary tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}*/
class Solution {
    ArrayList<Integer>ans =new ArrayList<>() ;
    public ArrayList<Integer> Ancestors(Node root, int target) {
        ArrayList<Integer>temp =new ArrayList<>() ;
        
       help(root,target,temp);
       Collections.reverse(ans);
       return ans;
    }
    void help(Node root  , int target, ArrayList<Integer>temp){
        if(root == null)return ;
        
        if(root.data == target)
        {
            ans.addAll(temp) ;
            return ;
        }
        
        temp.add(root.data);
        help(root.left,target,temp);
        help(root.right,target,temp);
        
        temp.remove(temp.size()-1);
    }
}
