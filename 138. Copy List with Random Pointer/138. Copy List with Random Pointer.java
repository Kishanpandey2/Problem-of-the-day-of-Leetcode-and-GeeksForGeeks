
class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> map = new HashMap<>() ;

        Node cur = head ;
        Node nHead = new Node(-1) ;
        Node prev = nHead ;
        while(cur!= null){
            Node node = new Node(cur.val) ;
            prev.next = node ;
            map.put(cur,node) ;

            prev = prev.next ;
            cur = cur.next ;
        }

        nHead = nHead.next;
        Node c1 = head;
        Node c2 = nHead ;

        while(c1!= null){
            c2.random = (c1.random != null?map.get(c1.random):null);

            c2 = c2.next ;
            c1 = c1.next ;
        }

        return nHead;
    }
}
