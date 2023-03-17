class Trie {
    private class Node
    {
        Node child[]  ;
        boolean isEnd ;

        Node(){
            child = new Node[26] ;
        }
    }
    final private Node root ;
    public Trie() {
        root = new Node() ;
    }
    
    public void insert(String word) {
        Node cur = root ;

        for(int i = 0 ;i<word.length() ;i++){
            char ch = word.charAt(i) ;

            if(cur.child[ch-'a'] == null)
            {
                cur.child[ch-'a'] = new Node() ;
            }
            cur = cur.child[ch-'a'];
        }
        cur.isEnd = true ;
    }
    
    public boolean search(String word) {
        Node cur = root ;

        for(int i = 0 ;i<word.length() ;i++){
            char ch = word.charAt(i) ;

            if(cur.child[ch-'a']==null)
            {
               return false ;
            }
          cur = cur.child[ch-'a'];
        }

        return cur.isEnd ;
    }
    
    public boolean startsWith(String prefix) {
         Node cur = root ;

        for(int i = 0 ;i<prefix.length() ;i++){
            char ch = prefix.charAt(i) ;

            if(cur.child[ch-'a']==null)
            {
               return false ;
            }
          cur = cur.child[ch-'a'];
        }

        return true ;
    }
}
