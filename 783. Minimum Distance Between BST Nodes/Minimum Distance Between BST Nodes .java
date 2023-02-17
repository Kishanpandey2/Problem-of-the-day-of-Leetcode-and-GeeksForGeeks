class Solution {
    public int minDiffInBST(TreeNode root) {
        List<Integer>list = new LinkedList<>() ;
        add(root,list) ;
        Collections.sort(list) ;
        int min= Integer.MAX_VALUE ;
        for(int i = 0 ;i<list.size()-1 ;i++){
            int diff = Math.abs(list.get(i)-list.get(i+1)) ;
            min = Math.min(min,diff) ;
        }
        return min ;
    }
    void add(TreeNode root ,List<Integer>list){
        if(root== null)
        return  ;
        list.add(root.val) ;
        add(root.left,list) ;
        add(root.right,list) ;
    }
}
