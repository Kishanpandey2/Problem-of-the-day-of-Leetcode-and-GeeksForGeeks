

class Solution
{
    static int ans;
    public static int goodSubtrees(Node root,int k)
    {
        ans=0;
        help(root,k);
        return ans;
    }
    public static HashSet<Integer> help(Node root,int k)
    {
        if(root==null) return new HashSet<>();
        HashSet<Integer> l = help(root.left, k);
        HashSet<Integer> r = help(root.right, k);
         
         HashSet<Integer> tot =  new HashSet<>();
         for(int x : l)
         tot.add(x);
         
         for(int x : r)
         tot.add(x);
         
         tot.add(root.data);
         
         if(tot.size()<=k)
         ans++;
         
         return tot;
        
    }
}
