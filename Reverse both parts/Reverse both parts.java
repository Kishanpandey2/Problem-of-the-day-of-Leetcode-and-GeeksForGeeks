class Solution {
    public static Node reverse(Node head, int k) {
        Node cur = head; 
        for(int i = 1 ;i<k ;i++){
            cur = cur.next ;
        }
        Node newHead = cur.next ;
        cur.next = null;
        Node rev1 = reverse(head) ;
        Node rev2 = reverse(newHead) ;
        
        cur = rev1 ;
        while(cur.next != null)
        cur = cur.next ;
         
         cur.next = rev2 ;
         
         return rev1 ;
        
    }
    public static Node reverse(Node head ){
        Node prev = null , cur = head , next = null  ;
        while(cur!=null){
            next = cur.next ;
            cur.next = prev ;
            prev = cur ;
            cur = next ;
        }
        return prev ;
    }
}
        
