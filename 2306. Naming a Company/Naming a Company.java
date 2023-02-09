class Solution {
    public long distinctNames(String[] ideas) {
        Set<String>set[] = new Set[26]  ;
        for(int i = 0 ;i<26;i++){
            set[i] = new HashSet<>() ;
        }
        for(String s:ideas){
            set[s.charAt(0)-'a'].add(s.substring(1));
        }
        int [][]same = new int[26][26];
        for(int i = 0 ;i<26;i++)
        {
            for(String s : set[i]){
                for(int  j = i+1;j<26;j++){
                    if(set[j].contains(s))
                    same[i][j]++;
                }
            }
        }
        long ans = 0 ;
        for(int i = 0 ;i<26;i++)
        {
            for(int j = i+1 ;j<26;j++)
            {
                    ans += (set[i].size()- same[i][j]) *  (set[j].size()- same[i][j]) * 2 ;
            }
        }
        return ans ;
    }
}
