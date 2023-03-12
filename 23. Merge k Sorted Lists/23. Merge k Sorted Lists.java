class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0 )
        return null ;
        ListNode head = new ListNode(0) ;
        ListNode temp = head ;
        PriorityQueue<Integer>pq = new PriorityQueue<>() ;
        for(ListNode list: lists){
            while(list != null){
                pq.add(list.val) ;
                 list = list.next ;
            }
        }
        
        while(!pq.isEmpty()){
            int no = pq.poll() ;
            temp.next = new ListNode(no) ;
            temp = temp.next  ;
        }
        return head.next ;
    }
}
