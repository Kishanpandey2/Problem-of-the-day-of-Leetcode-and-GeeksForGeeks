
class Solution{
     ArrayList<String> ans = new ArrayList<>();
    ArrayList<String> CamelCase(int N,String[] Dictionary,String Pattern){
        trie root = new trie() ;
        build(Dictionary,root) ;
        find(Pattern,root);
        Collections.sort(ans) ;
        if(ans.isEmpty())
        ans.add("-1") ;
        return ans ;
    }
    public void  build(String []a , trie root ){
        trie temp = null ;
        for(int i = 0 ;i<a.length ;i++){
            temp = root ;
            for(int j = 0 ;j<a[i].length() ;j++){
                if(Character.isUpperCase(a[i].charAt(j))){
                    if(temp.ch[a[i].charAt(j) - 'A']== null)
                    temp.ch[a[i].charAt(j) - 'A']= new trie() ;
                    temp = temp.ch[a[i].charAt(j) - 'A'];
                }
            }
            temp.al.add(a[i]) ;
        }}
        public int find(String s, trie root){
            for(int i = 0 ;i<s.length()  ;i++){
                if(root.ch[s.charAt(i)-'A']==null)
                return 0 ;
                root = root.ch[s.charAt(i)-'A'] ;
            }
            printAllWords(root) ;
            return 1 ;
        }
        public void printAllWords(trie root){
            for(String str:root.al)
            ans.add(str) ;
            
            for(int i = 0 ;i<26 ;i++){
                trie child = root.ch[i] ;
                if(child != null)
                printAllWords(child) ;
            }
        }
    }
    class trie{
        trie []ch  ;
        ArrayList<String>al  ;
        public trie(){
            ch = new trie[26] ;
            al = new ArrayList<>() ;
            for(int i = 0 ;i<26;i++){
                ch[i] = null ;
            }
        
    }
}
