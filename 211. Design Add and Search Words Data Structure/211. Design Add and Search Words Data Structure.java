class WordDictionary {
    class TrieNode{
        TrieNode []child  = new TrieNode[26] ;
        boolean isEndOfWord ;

    }

    TrieNode root ;
    public WordDictionary() {
        
        root = new TrieNode() ;
    }
    
    public void addWord(String word) {
        TrieNode temp = root ;

        char []ar = word.toCharArray();

        for(int i = 0 ;i<ar.length ;i++){
            if(temp.child[ar[i]-'a']==null)
            temp.child[ar[i]-'a'] = new TrieNode() ;

            temp =  temp.child[ar[i]-'a']  ;
        }
        temp.isEndOfWord = true ;
    }
    
    public boolean search(String word) {
        char []ar = word.toCharArray();

        return helperFunction(root, 0 , ar) ;
    }

   boolean helperFunction(TrieNode node,int pos,char[] ch){
        for(int i=pos;i<ch.length;i++){
            if(ch[i]=='.'){
                for(int p=0;p<26;p++){
                    if(node.child[p]!=null){
                        if(helperFunction(node.child[p],i+1,ch)){
                            return true;
                        } 
                    }
                }
                return false;
            }
            else{
                if(node.child[ch[i]-'a']!=null){
                    node=node.child[ch[i]-'a'];
                }
                else{
                    return false;
                }
            }
        }
        
        return node.isEndOfWord;
    }

}
