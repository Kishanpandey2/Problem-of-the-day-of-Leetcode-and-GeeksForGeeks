class BrowserHistory {

    class Node{
        Node prev, next ;
        String url ;

        Node(String url){
            prev = null ;
            next = null ;

            this.url = url ;
        }
    }

    Node cur  ;
    public BrowserHistory(String homepage) {
        cur = new Node(homepage) ;
    }
    
    public void visit(String url) {
        Node temp = new Node(url) ;

        cur.next = temp ;
        temp.prev = cur ;
        cur = cur.next ;
    }
    
    public String back(int steps) {
        while(cur.prev != null && steps-- > 0)
        cur = cur.prev ;

        return cur.url ;
    }
    
    public String forward(int steps) {
        while(cur.next != null && steps-- > 0)
        cur = cur.next ;

        return cur.url ;
    }
}
