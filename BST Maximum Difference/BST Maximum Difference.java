class Solution
{
     public static int minpath(Node root){
        if(root == null) return 0;
        int sum = root.data;
        if(root.left == null) sum += minpath(root.right);
        else if(root.right == null) sum += minpath(root.left);
        else sum += Math.min(minpath(root.left),                                                                                       minpath(root.right));
        return sum;
    }
    public static int maxDifferenceBST(Node root,int target)
    {
        int rootsum = 0, leafsum = 0;
        while(root!= null){
            rootsum += root.data;
            if(target==root.data) break;
            if(target<root.data) root = root.left;
            else root = root.right;
        }
        if(root == null) return -1;
        leafsum = minpath(root);
        return rootsum - leafsum;
    }
}
