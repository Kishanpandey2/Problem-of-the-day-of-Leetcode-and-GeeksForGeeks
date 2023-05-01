
class Solution{
     Map<String, Integer> map = new HashMap<>();
     
    public int duplicateSubtreeNaryTree(Node root){
       
       int ans=0;
       solve(root);
       
       for(Map.Entry<String, Integer> e : map.entrySet())
        if(e.getValue()>1) ans++;
        
       return ans;
    }
    String solve(Node root)
    {
        String s = root.data+"";
        for(Node nei : root.children)
        s+= solve(nei);
        
        map.put(s, map.getOrDefault(s,0)+1);
        return s;
        
    }
}
