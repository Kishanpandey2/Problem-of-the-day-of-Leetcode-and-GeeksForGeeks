
class Solution {
    List<String>ans ;
    public List<String> find_permutation(String S) {
      ans = new ArrayList<>() ;
        char[] chs = S.toCharArray();
        Set<String> set = new HashSet<>();
        help(chs,0,set ) ;
        for(String s :set){
          ans.add(s);
        }
       Collections.sort(ans);
        return ans;
    }
    void help(char []chs, int index, Set<String>set){
        if (index >= chs.length) return;
        
        for (int i=index; i < chs.length; i++) {
            swap(chs, i, index);
            help(chs, index + 1, set);
            swap(chs, i, index);
            
            set.add(new String(chs));
    }
    }
     void swap(char[] chs, int i, int j) {
        char temp = chs[i];
        chs[i] = chs[j];
        chs[j] = temp;
    }
}
