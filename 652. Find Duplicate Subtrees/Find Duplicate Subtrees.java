class Solution {
    Map<String,Integer>map ;
    List<TreeNode> ans  ;
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        map = new HashMap<>() ;
        ans = new ArrayList<>() ;

        traverse(root);
        return ans ;
    }

    String traverse(TreeNode node){
        if(node ==null)
        return "$" ;

        String subPath = node.val + ","+ traverse(node.left) + "," + traverse(node.right) ;

        map.put(subPath, map.getOrDefault(subPath,0)+1) ;

        if(map.get(subPath) == 2)
        ans.add(node) ;
        return subPath ;
    }
}
