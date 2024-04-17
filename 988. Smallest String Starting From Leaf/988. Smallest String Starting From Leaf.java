class Solution {
    
    public String smallestFromLeaf(TreeNode root) {
        String ans ="" ;
        ArrayList<Integer> list = new ArrayList<>() ;
        List<List<Integer>> output = new ArrayList<>() ;

        traverse(root,list, output) ; 

        for(List<Integer> l : output)
        {
            StringBuilder sb = new StringBuilder() ;
            for(Integer n : l)
            {
                char ch = (char ) (n+'a') ;
                sb.append(ch) ;
            }
            String cur = sb.reverse().toString() ;

            if(ans.equals(""))
            ans = cur ;
            if(ans.compareTo(cur)>0)
            ans = cur ;
        }

        return ans ;
    }
    void traverse(TreeNode root,  ArrayList<Integer>list , List<List<Integer>> output){
        if(root == null)return ;

        list.add(root.val) ;

        if(root.left == null && root.right == null)
        {
            output.add(new ArrayList(list)) ;
            return ;
        }

        traverse(root.left,new ArrayList<>(list), output);
        traverse(root.right,new ArrayList<>(list), output);
    }
}
